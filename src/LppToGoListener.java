import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LppToGoListener extends lppBaseListener{
    private int currentIndentLevel = 0;
    public StringBuilder codeHeader = new StringBuilder().append("package main\n\n");
    public StringBuilder translatedGo = new StringBuilder();

    private void insertRequiredLibrary(String lib) {
        if (codeHeader.indexOf("import \"" + lib + "\"\n") == -1) codeHeader.append("import \"").append(lib).append("\"\n");
    }

    private void printCurrentIndent() {
        for (int i = 0; i < currentIndentLevel; i++) {
            translatedGo.append("\t");
        }
    }

    private void increaseIndent() {
        currentIndentLevel++;
    }

    private void decreaseIndent() {
        currentIndentLevel--;
    }

    private HashSet<String> globalVariables = new HashSet<>();

    private final Map<String, String> operatorCorrespondence = new HashMap<>();

    {
        operatorCorrespondence.put("<>", "!=");
        operatorCorrespondence.put("+", "+");
        operatorCorrespondence.put("-", "-");
        operatorCorrespondence.put("*", "*");
        operatorCorrespondence.put("/", "/");
        operatorCorrespondence.put("^", "^");
        operatorCorrespondence.put("=", "==");
        operatorCorrespondence.put("<", "<");
        operatorCorrespondence.put("<==", "<=");
        operatorCorrespondence.put("<=", "<=");
        operatorCorrespondence.put(">", ">");
        operatorCorrespondence.put(">==", ">=");
        operatorCorrespondence.put(">=", ">=");
        operatorCorrespondence.put(" div ", " / ");
        operatorCorrespondence.put(" mod ", " % ");
        operatorCorrespondence.put(" y ", " && ");
        operatorCorrespondence.put(" o ", " || ");
        operatorCorrespondence.put("verdadero", "true");
        operatorCorrespondence.put("falso", "false");
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    };

    private String getVarType(String exp) {
        StringBuilder result = new StringBuilder();
        String variableTipo = exp.toLowerCase();

        if(variableTipo.contains("arreglo")) {
            variableTipo = variableTipo.substring(variableTipo.lastIndexOf("]de") + 3).trim();
        }

        if(variableTipo.contains("cadena")) {
            result.append("string");
        }

        if(!variableTipo.toLowerCase().contains("cadena")) {
            switch (variableTipo) {
                case "entero":
                    result.append("int");
                    break;
                case "real":
                    result.append("float32");
                    break;
                case "booleano":
                    result.append("bool");
                    break;
                case "caracter":
                    result.append("rune");
                    break;
                default:
                    result.append(capitalize(variableTipo));
                    break;
            }
        }

        return result.toString();
    }

    public String convertOperators(String rawExp) {
        Map<Integer, String> literals = new HashMap<>();
        int index = 0;
        Pattern pattern = Pattern.compile("\"[^\"]*\"");
        Matcher matcher = pattern.matcher(rawExp);

        while (matcher.find()) {
            String literal = matcher.group();
            literals.put(index, literal);
            index++;
        }

        rawExp = rawExp
                .replaceAll("(?<![a-zA-Z]_)div(?![a-zA-Z_])", " div ")
                .replaceAll("(?<![a-zA-Z]_)mod(?![a-zA-Z_])", " mod ")
                .replaceAll("(?<![a-zA-Z_])y(?![a-zA-Z_])", " y ")
                .replaceAll("(?<![a-zA-Z_])o(?![a-zA-Z_])", " o ");

        rawExp = rawExp.replaceAll("\"[^\"]*\"", "\"\"").toLowerCase();

        List<Map.Entry<String, String>> toSort = new ArrayList<>(operatorCorrespondence.entrySet());
        toSort.sort(Map.Entry.<String, String>comparingByKey().reversed());
        for (Map.Entry<String, String> entry : toSort) {
            rawExp = rawExp.replace(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : literals.entrySet()) {
            rawExp = rawExp.replaceFirst("\"\"", entry.getValue());
        }

        return rawExp;
    }

    @Override
    public void enterDec_registros(lppParser.Dec_registrosContext ctx) {
        String registroId = String.valueOf(ctx.ID().get(0));
        String enterDec_registrosTranslated = "type " + capitalize(registroId) + " struct {\n";
        printCurrentIndent();
        translatedGo.append(enterDec_registrosTranslated);
        increaseIndent();
    }

    @Override
    public void exitDec_registros(lppParser.Dec_registrosContext ctx) {
        String exitDec_registrosTranslated = "}\n\n";
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append(exitDec_registrosTranslated);

    }

    @Override
    public void enterDec_variable_int(lppParser.Dec_variable_intContext ctx) {
        String enterDec_variable_intTranslated = ctx.ID().getText().toLowerCase() + " ";
        printCurrentIndent();
        translatedGo.append(enterDec_variable_intTranslated);
    }

    @Override
    public void enterDec_variable(lppParser.Dec_variableContext ctx) {
        String enterDec_variableTranslated = "var " + ctx.ID().getText().toLowerCase() + " ";
        printCurrentIndent();
        translatedGo.append(enterDec_variableTranslated);
    }

    @Override
    public void exitDec_variable(lppParser.Dec_variableContext ctx) {
        String exitDec_variableTranslated = getVarType(ctx.tipo_variable().getText()) + "\n";

        translatedGo.append(exitDec_variableTranslated);
    }

    @Override
    public void enterDec_sig_variable(lppParser.Dec_sig_variableContext ctx) {
        String enterDec_sig_variableTranslated = ", " + ctx.ID().getText().toLowerCase() + " ";
        translatedGo.append(enterDec_sig_variableTranslated);
    }

    @Override
    public void exitDec_variable_int(lppParser.Dec_variable_intContext ctx) {
        String exitDec_variable_intTranslated = getVarType(ctx.tipo_variable().getText()) + '\n';
        translatedGo.append(exitDec_variable_intTranslated);
    }

    @Override
    public void enterTipo(lppParser.TipoContext ctx) {
        String variableTipo = ctx.getText();

        if(variableTipo.contains("cadena")) {
            translatedGo.append("string");
        }
        switch (variableTipo) {
            case "entero":
                translatedGo.append("int");
                break;
            case "real":
                translatedGo.append("float32");
                break;
            case "booleano":
                translatedGo.append("bool");
                break;
            case "caracter":
                translatedGo.append("rune");
                break;
        }
    }

    @Override
    public void enterArreglo_variable(lppParser.Arreglo_variableContext ctx) {
        String enterArreglo_variableTranslated = "[" + ctx.exp_arreglo().getText().replace(",", "][") + "]";
        translatedGo.append(enterArreglo_variableTranslated);
    }

    @Override
    public void enterProg_main(lppParser.Prog_mainContext ctx) {
        String enterProg_mainTranslated = "\nfunc main() {\n";
        printCurrentIndent();
        translatedGo.append(enterProg_mainTranslated);
        increaseIndent();
    }

    @Override
    public void exitProg_main(lppParser.Prog_mainContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("\n}");
    }

    @Override
    public void enterAsigne(lppParser.AsigneContext ctx) {
        String enterAsigneTranslated = "";
        String rightHand;
        String expText = ctx.exp().get(1).getText();
        String leftText = ctx.exp().get(0).getText();

        leftText = replaceBrackets(leftText);

        enterAsigneTranslated += leftText.toLowerCase() + " = ";

        if(expText.contains(".") || ctx.exp().get(1).ID() == null && !(ctx.exp().get(1).literal() != null && ctx.exp().get(1).literal().CADENA_LITERAL() != null)){
            rightHand = convertOperators(ctx.exp().get(1).getText().toLowerCase());
        } else if (ctx.exp().get(1).ID() != null){
            rightHand = convertOperators(ctx.exp().get(1).ID().getText());
        } else {
            rightHand = convertOperators(ctx.exp().get(1).literal().getText());
        }

        enterAsigneTranslated += rightHand;

        if(ctx.exp().get(1).ID() != null && !expText.contains(".")) {
            enterAsigneTranslated += "(";
        }

        printCurrentIndent();
        translatedGo.append(enterAsigneTranslated);
    }

    private String replaceBrackets(String exp) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        Stack<String> stack = new Stack<>();

        while (index < exp.length()) {
            char c = exp.charAt(index);

            if (c == '[') {
                stack.push("[");
                result.append("[");
            } else if (c == ']') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    result.append("]");
                }
            } else if (c == ',') {
                if (!stack.isEmpty()) {
                    result.append("][");
                } else {
                    result.append(",");
                }
            } else {
                result.append(c);
            }

            index++;
        }

        return result.toString();
    }

    @Override
    public void exitAsigne(lppParser.AsigneContext ctx) {
        if(ctx.exp().get(1).ID() != null && !ctx.exp().get(1).getText().contains(".")) {
            translatedGo.append(")");
        }
        translatedGo.append("\n");
    }

    @Override
    public void enterExp_list(lppParser.Exp_listContext ctx) {
        StringBuilder enterExp_listTranslated = new StringBuilder();
        lppParser.ExpContext lastElement = ctx.exp().get(ctx.exp().size() - 1);

        for (int i = 0; i < ctx.exp().size() - 1; i++) {
            lppParser.ExpContext currentElement = ctx.exp().get(i);

            String exp = currentElement.getText();
            if(currentElement.ID() != null) {
                exp = exp.toLowerCase();
            }

            exp = replaceBrackets(exp);

            if(!(currentElement.literal() != null && currentElement.literal().CADENA_LITERAL() != null)) {
                exp = convertOperators(exp);
            }

            enterExp_listTranslated.append(exp).append(", ");
        }

        String lastExp = lastElement.getText();

        lastExp = replaceBrackets(lastExp);

        if(!(lastElement.literal() != null && lastElement.literal().CADENA_LITERAL() != null)) {
            if(lastElement.ID() != null) {
                enterExp_listTranslated.append(lastExp.toLowerCase());
            } else {
                enterExp_listTranslated.append(convertOperators(lastExp));
            }
        } else {
            enterExp_listTranslated.append(lastExp);
        }

        translatedGo.append(enterExp_listTranslated);
    }

    @Override
    public void enterEscriba(lppParser.EscribaContext ctx) {
        insertRequiredLibrary("fmt");
        String enterEscribaTranslated = "fmt.Print(";
        printCurrentIndent();
        translatedGo.append(enterEscribaTranslated);
    }

    @Override
    public void exitEscriba(lppParser.EscribaContext ctx) {
        translatedGo.append(")\n");
    }

    @Override
    public void enterLea(lppParser.LeaContext ctx) {
        insertRequiredLibrary("bufio");
        insertRequiredLibrary("os");

        translatedGo.append("\n");
        String enterLeaTranslated = "reader := bufio.NewReader(os.Stdin)\n";
        printCurrentIndent();
        translatedGo.append(enterLeaTranslated);
    }

    @Override
    public void exitLea(lppParser.LeaContext ctx) {
        ctx.exp_lea().exp().forEach(e -> {
            StringBuilder exitLeaTranslated = new StringBuilder();
            exitLeaTranslated.append(e.getText()).append(", _ = reader.ReadString('\\n')\n");
            printCurrentIndent();
            translatedGo.append(exitLeaTranslated);
        });
    }
    @Override
    public void enterRetorne(lppParser.RetorneContext ctx) {
        String enterRetorneTranslated = "return " + ctx.exp().getText() + "\n";
        printCurrentIndent();
        translatedGo.append(enterRetorneTranslated);
    }

    @Override
    public void enterDec_funcion(lppParser.Dec_funcionContext ctx) {
        String enterDec_funcionTranslated = "\n\nfunc " + ctx.ID().getText().toLowerCase();
        printCurrentIndent();
        translatedGo.append(enterDec_funcionTranslated);
    }

    @Override
    public void exitDec_funcion(lppParser.Dec_funcionContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }

    @Override
    public void enterParametros(lppParser.ParametrosContext ctx) {
        translatedGo.append("(");
    }

    @Override
    public void exitParametros(lppParser.ParametrosContext ctx) {
        translatedGo.append(") ");
    }

    @Override
    public void enterTipo_funcion(lppParser.Tipo_funcionContext ctx) {
        translatedGo.append(getVarType(ctx.getText()) + "  {\n");
        increaseIndent();
    }

    @Override
    public void enterProg(lppParser.ProgContext ctx) {
        printCurrentIndent();
    }

    @Override
    public void enterParametro_sig(lppParser.Parametro_sigContext ctx) {
        translatedGo.append(", ");
    }

    @Override
    public void enterDec_procedimiento(lppParser.Dec_procedimientoContext ctx) {
        String enterDec_procedimientoTranslated = "\n\nfunc " + ctx.ID().getText().toLowerCase();
        printCurrentIndent();
        translatedGo.append(enterDec_procedimientoTranslated);
    }

    @Override
    public void exitDec_procedimiento(lppParser.Dec_procedimientoContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }

    @Override
    public void enterParametros_proc(lppParser.Parametros_procContext ctx) {
        translatedGo.append("(");
    }

    @Override
    public void enterParametro_sig_proc(lppParser.Parametro_sig_procContext ctx) {
        translatedGo.append(", ");
    }

    @Override
    public void exitParametros_proc(lppParser.Parametros_procContext ctx) {
        printCurrentIndent();
        translatedGo.append(") {\n");
        increaseIndent();
    }

    @Override
    public void enterDec_var(lppParser.Dec_varContext ctx) {
        if(ctx.VAR() != null) {
            globalVariables.add(ctx.ID().getText());
        }

        String enterDec_varTranslated = ctx.ID().getText();
        printCurrentIndent();
        translatedGo.append(enterDec_varTranslated);
    }

    @Override
    public void exitDec_var(lppParser.Dec_varContext ctx) {
        if(ctx.VAR() == null) {
            translatedGo.append(" " + getVarType(ctx.tipo_var().getText()));
        }
    }

    @Override
    public void enterCaso(lppParser.CasoContext ctx) {
        translatedGo.append("\n");
        String enterCasoTranslated = "switch " + ctx.ID().getText() + " {\n";
        printCurrentIndent();
        translatedGo.append(enterCasoTranslated);
        increaseIndent();
    }

    @Override
    public void exitCaso(lppParser.CasoContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterCaso_sino(lppParser.Caso_sinoContext ctx) {
        translatedGo.append("\n");
        printCurrentIndent();
        translatedGo.append("default:\n");
        increaseIndent();
    }

    @Override
    public void exitCaso_sino(lppParser.Caso_sinoContext ctx) {
        translatedGo.append("\n");
        decreaseIndent();
    }

    @Override
    public void enterOpcion(lppParser.OpcionContext ctx) {
        translatedGo.append("\n");
        printCurrentIndent();
        translatedGo.append("case ");
        increaseIndent();
    }

    @Override
    public void exitOpcion(lppParser.OpcionContext ctx) {
        decreaseIndent();
    }

    @Override
    public void exitOpcion_exp(lppParser.Opcion_expContext ctx) {
        translatedGo.append(":\n");
    }

    @Override
    public void enterSi(lppParser.SiContext ctx) {
        String enterSiTranslated = "if " + convertOperators(ctx.exp().getText()) + " {\n";
        printCurrentIndent();
        translatedGo.append(enterSiTranslated);
        increaseIndent();
    }

    @Override
    public void exitSi(lppParser.SiContext ctx) {
        translatedGo.append("\n\n");
    }


    @Override
    public void exitSi_aux(lppParser.Si_auxContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}");
    }

    @Override
    public void enterSino(lppParser.SinoContext ctx) {
        String enterSinoTranslated = " else ";

        printCurrentIndent();

        if(ctx.si() == null) {
            enterSinoTranslated += " {\n";
            increaseIndent();
        }

        translatedGo.append(enterSinoTranslated);
    }

    @Override
    public void exitSino(lppParser.SinoContext ctx) {
        if(ctx.si() == null) {
            decreaseIndent();
            printCurrentIndent();
            translatedGo.append("}");
        }
    }

    @Override
    public void enterMientras(lppParser.MientrasContext ctx) {
        translatedGo.append("\n");
        String enterMientrasTranslated = "for " + convertOperators(ctx.exp().getText()) + " {\n";
        printCurrentIndent();
        translatedGo.append(enterMientrasTranslated);
        increaseIndent();
    }

    @Override
    public void exitMientras(lppParser.MientrasContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterLlamar(lppParser.LlamarContext ctx) {
        String enterLlamarTranslated;
        if(ctx.ID().getText().equalsIgnoreCase("nueva_linea")) {
            if (codeHeader.indexOf("import \"fmt\"\n") == -1) codeHeader.append("import \"fmt\"\n");
            enterLlamarTranslated = "fmt.Println()\n";
        } else {
            enterLlamarTranslated = ctx.ID() + "()\n";
        }

        printCurrentIndent();
        translatedGo.append(enterLlamarTranslated);
    }

    @Override
    public void enterRepita(lppParser.RepitaContext ctx) {
        String enterRepitaTranslated = "for ok := true; ok; ok = " + convertOperators(ctx.exp().getText()) + " {\n";
        printCurrentIndent();
        translatedGo.append(enterRepitaTranslated);
        increaseIndent();
    }

    @Override
    public void exitRepita(lppParser.RepitaContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterPara(lppParser.ParaContext ctx) {
        String enterParaTranslated = "for " + ctx.exp().get(0).getText().toLowerCase() + " = " + ctx.exp().get(1).getText() + "; " + ctx.exp().get(0).getText().toLowerCase() + " <= " + ctx.exp().get(2).getText() + "; " + ctx.exp().get(0).getText().toLowerCase() + "++ {\n";
        printCurrentIndent();
        increaseIndent();
        translatedGo.append(enterParaTranslated);
    }

    @Override
    public void exitPara(lppParser.ParaContext ctx) {
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }
}
