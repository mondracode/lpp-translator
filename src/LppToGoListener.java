import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Map.entry;

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

    private final Map<String, String> operatorCorrespondence = Map.ofEntries(
        entry("<>", "!="),
        entry("+", "+"),
        entry("-", "-"),
        entry("*", "*"),
        entry("/", "/"),
        entry("^", "^"),
        entry("=", "=="),
        entry("<", "<"),
        entry("<==", "<="),
        entry(">", ">"),
        entry(">==", ">="),
        entry(" div ", " / "),
        entry(" mod ", " % "),
        entry(" y ", " && "),
        entry(" o ", " || ")
    );

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    };

    private String getVarType(lppParser.Tipo_variableContext ctx) {
        StringBuilder result = new StringBuilder();
        String variableTipo = ctx.getText().toLowerCase();

        if(variableTipo.contains("cadena")) {
            result.append("string");
        }

        if(!variableTipo.toLowerCase().contains("arreglo") && !variableTipo.toLowerCase().contains("cadena")) {
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

        rawExp = rawExp.replaceAll("\"[^\"]*\"", "\"\"");

        for (Map.Entry<String, String> entry : operatorCorrespondence.entrySet()) {
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
        System.out.print(enterDec_registrosTranslated);
        printCurrentIndent();
        translatedGo.append(enterDec_registrosTranslated);
        increaseIndent();
    }

    @Override
    public void exitDec_registros(lppParser.Dec_registrosContext ctx) {
        String exitDec_registrosTranslated = "}\n\n";
        System.out.print(exitDec_registrosTranslated);
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append(exitDec_registrosTranslated);

    }

    @Override
    public void enterDec_variable_int(lppParser.Dec_variable_intContext ctx) {
        String enterDec_variable_intTranslated = ctx.ID().getText().toLowerCase() + " ";
        System.out.print(enterDec_variable_intTranslated);
        printCurrentIndent();
        translatedGo.append(enterDec_variable_intTranslated);
    }

    @Override
    public void enterDec_variable(lppParser.Dec_variableContext ctx) {
        String enterDec_variableTranslated = "var " + ctx.ID().getText().toLowerCase() + " ";
        System.out.print(enterDec_variableTranslated);
        printCurrentIndent();
        translatedGo.append(enterDec_variableTranslated);
    }

    @Override
    public void exitDec_variable(lppParser.Dec_variableContext ctx) {
        String exitDec_variableTranslated = getVarType(ctx.tipo_variable()) + "\n";
        System.out.print(exitDec_variableTranslated);
        translatedGo.append(exitDec_variableTranslated);
    }

    @Override
    public void enterDec_sig_variable(lppParser.Dec_sig_variableContext ctx) {
        String enterDec_sig_variableTranslated = ", " + ctx.ID().getText().toLowerCase() + " ";
        System.out.print(enterDec_sig_variableTranslated);
        translatedGo.append(enterDec_sig_variableTranslated);
    }

    @Override
    public void exitDec_variable_int(lppParser.Dec_variable_intContext ctx) {
        String exitDec_variable_intTranslated = getVarType(ctx.tipo_variable()) + '\n';
        System.out.print(exitDec_variable_intTranslated);
        translatedGo.append(exitDec_variable_intTranslated);
    }

    @Override
    public void enterTipo(lppParser.TipoContext ctx) {
        String variableTipo = ctx.getText();

        if(variableTipo.contains("cadena")) {
            System.out.print("string");
            translatedGo.append("string");
        }
        switch (variableTipo) {
            case "entero":
                System.out.print("int");
                translatedGo.append("int");
                break;
            case "real":
                System.out.print("float32");
                translatedGo.append("float32");
                break;
            case "booleano":
                System.out.print("bool");
                translatedGo.append("bool");
                break;
            case "caracter":
                System.out.print("rune");
                translatedGo.append("rune");
                break;
        }
    }

    @Override
    public void enterArreglo_variable(lppParser.Arreglo_variableContext ctx) {
        String enterArreglo_variableTranslated = "[" + ctx.ENTERO_LITERAL().getText() + "]";
        System.out.print(enterArreglo_variableTranslated);
        translatedGo.append(enterArreglo_variableTranslated);
    }

    @Override
    public void enterProg_main(lppParser.Prog_mainContext ctx) {
        String enterProg_mainTranslated = "\nfunc main() {\n";
        System.out.print(enterProg_mainTranslated);
        printCurrentIndent();
        translatedGo.append(enterProg_mainTranslated);
        increaseIndent();
    }

    @Override
    public void exitProg_main(lppParser.Prog_mainContext ctx) {
        System.out.print("\n}");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("\n}");
    }

    @Override
    public void enterAsigne(lppParser.AsigneContext ctx) {
        String enterAsigneTranslated = "";
        String rightHand;
        String expText = ctx.exp().get(1).getText();

        enterAsigneTranslated += ctx.exp().get(0).getText().toLowerCase() + " = ";

        if(expText.contains(".") || ctx.exp().get(1).ID() == null && !(ctx.exp().get(1).literal() != null && ctx.exp().get(1).literal().CADENA_LITERAL() != null)){
            rightHand = convertOperators(ctx.exp().get(1).getText().toLowerCase());
        } else if (ctx.exp().get(1).ID() != null){
            rightHand = convertOperators(ctx.exp().get(1).ID().getText());
        } else {
            rightHand = convertOperators(ctx.exp().get(1).literal().getText());
        }

        enterAsigneTranslated += rightHand;
        System.out.print(enterAsigneTranslated);

        if(ctx.exp().get(1).ID() != null && !expText.contains(".")) {
            System.out.print("(");
            enterAsigneTranslated += "(";
        }

        printCurrentIndent();
        translatedGo.append(enterAsigneTranslated);
    }

    @Override
    public void exitAsigne(lppParser.AsigneContext ctx) {
        if(ctx.exp().get(1).ID() != null && !ctx.exp().get(1).getText().contains(".")) {
            System.out.print(")");
            translatedGo.append(")");
        }
        System.out.println();
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

            if(!(currentElement.literal() != null && currentElement.literal().CADENA_LITERAL() != null)) {
                exp = convertOperators(exp);
            }

            System.out.print(exp + ", ");
            enterExp_listTranslated.append(exp).append(", ");
        }

        if(!(lastElement.literal() != null && lastElement.literal().CADENA_LITERAL() != null)) {
            if(lastElement.ID() != null) {
                System.out.print(lastElement.getText().toLowerCase());
                enterExp_listTranslated.append(lastElement.getText().toLowerCase());
            } else {
                System.out.print(convertOperators(lastElement.getText()));
                enterExp_listTranslated.append(convertOperators(lastElement.getText()));
            }
        } else {
            System.out.print(lastElement.getText());
            enterExp_listTranslated.append(lastElement.getText());
        }

        translatedGo.append(enterExp_listTranslated);
    }

    @Override
    public void enterEscriba(lppParser.EscribaContext ctx) {
        insertRequiredLibrary("fmt");
        String enterEscribaTranslated = "fmt.Print(";
        System.out.print(enterEscribaTranslated);
        printCurrentIndent();
        translatedGo.append(enterEscribaTranslated);
    }

    @Override
    public void exitEscriba(lppParser.EscribaContext ctx) {
        System.out.print(")\n");
        translatedGo.append(")\n");
    }

    @Override
    public void enterLea(lppParser.LeaContext ctx) {
        insertRequiredLibrary("bufio");
        insertRequiredLibrary("os");

        translatedGo.append("\n");
        String enterLeaTranslated = "reader := bufio.NewReader(os.Stdin)\n";
        System.out.print("\n" + enterLeaTranslated);
        printCurrentIndent();
        translatedGo.append(enterLeaTranslated);
    }

    @Override
    public void exitLea(lppParser.LeaContext ctx) {
        ctx.exp_lea().exp().forEach(e -> {
            StringBuilder exitLeaTranslated = new StringBuilder();
            exitLeaTranslated.append(e.getText()).append(", _ = reader.ReadString('\\n')\n");
            printCurrentIndent();
            System.out.print(e.getText() + ", _ = reader.ReadString('\\n')\n");
            translatedGo.append(exitLeaTranslated);
        });
    }
    @Override
    public void enterRetorne(lppParser.RetorneContext ctx) {
        String enterRetorneTranslated = "return " + ctx.exp().getText() + "\n";
        System.out.print(enterRetorneTranslated);
        printCurrentIndent();
        translatedGo.append(enterRetorneTranslated);
    }

    @Override
    public void enterDec_funcion(lppParser.Dec_funcionContext ctx) {
        String enterDec_funcionTranslated = "\n\nfunc " + ctx.ID().getText();
        System.out.print("func " + ctx.ID().getText());
        printCurrentIndent();
        translatedGo.append(enterDec_funcionTranslated);
    }

    @Override
    public void exitDec_funcion(lppParser.Dec_funcionContext ctx) {
        System.out.print("}\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }

    @Override
    public void enterParametros(lppParser.ParametrosContext ctx) {
        System.out.print("(");
        translatedGo.append("(");
    }

    @Override
    public void exitParametros(lppParser.ParametrosContext ctx) {
        System.out.print(") ");
        translatedGo.append(") ");
    }

    @Override
    public void enterProg(lppParser.ProgContext ctx) {
        System.out.print(" {\n");
        printCurrentIndent();
        translatedGo.append(" {\n");
        increaseIndent();
    }

    @Override
    public void enterParametro_sig(lppParser.Parametro_sigContext ctx) {
        System.out.print(", ");
        translatedGo.append(", ");
    }

    @Override
    public void enterDec_procedimiento(lppParser.Dec_procedimientoContext ctx) {
        String enterDec_procedimientoTranslated = "\n\nfunc " + ctx.ID().getText();
        System.out.print(enterDec_procedimientoTranslated);
        printCurrentIndent();
        translatedGo.append(enterDec_procedimientoTranslated);
    }

    @Override
    public void exitDec_procedimiento(lppParser.Dec_procedimientoContext ctx) {
        System.out.print("}\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }

    @Override
    public void enterParametros_proc(lppParser.Parametros_procContext ctx) {
        System.out.print("(");
        translatedGo.append("(");
    }

    @Override
    public void enterParametro_sig_proc(lppParser.Parametro_sig_procContext ctx) {
        System.out.print(", ");
        translatedGo.append(", ");
    }

    @Override
    public void exitParametros_proc(lppParser.Parametros_procContext ctx) {
        System.out.print(") {\n");
        printCurrentIndent();
        translatedGo.append(") {\n");
        increaseIndent();
    }

    @Override
    public void enterDec_var(lppParser.Dec_varContext ctx) {
        if(ctx.VAR() != null) {
            globalVariables.add(ctx.ID().getText());
        }

        String enterDec_varTranslated = ctx.ID().getText() + " ";
        System.out.print(enterDec_varTranslated);
        printCurrentIndent();
        translatedGo.append(enterDec_varTranslated);
    }

    @Override
    public void enterCaso(lppParser.CasoContext ctx) {
        translatedGo.append("\n");
        String enterCasoTranslated = "switch " + ctx.ID().getText() + " {\n";
        System.out.print("\n" + enterCasoTranslated);
        printCurrentIndent();
        translatedGo.append(enterCasoTranslated);
        increaseIndent();
    }

    @Override
    public void exitCaso(lppParser.CasoContext ctx) {
        System.out.print("}\n\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterCaso_sino(lppParser.Caso_sinoContext ctx) {
        translatedGo.append("\n");
        System.out.print("\ndefault:\n");
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
        System.out.print("\ncase ");
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
        System.out.print(":\n");
        translatedGo.append(":\n");
    }

    @Override
    public void enterSi(lppParser.SiContext ctx) {
        String enterSiTranslated = "if " + convertOperators(ctx.exp().getText()) + " {\n";
        System.out.print(enterSiTranslated);
        printCurrentIndent();
        translatedGo.append(enterSiTranslated);
        increaseIndent();
    }

    @Override
    public void exitSi(lppParser.SiContext ctx) {
        System.out.println("\n");
        translatedGo.append("\n\n");
    }


    @Override
    public void exitSi_aux(lppParser.Si_auxContext ctx) {
        System.out.print("}");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}");
    }

    @Override
    public void enterSino(lppParser.SinoContext ctx) {
        String enterSinoTranslated = " else ";
        System.out.print(enterSinoTranslated);

        printCurrentIndent();

        if(ctx.si() == null) {
            System.out.print(" {\n");
            enterSinoTranslated += " {\n";
            increaseIndent();
        }

        translatedGo.append(enterSinoTranslated);
    }

    @Override
    public void exitSino(lppParser.SinoContext ctx) {
        if(ctx.si() == null) {
            System.out.print("}");
            decreaseIndent();
            printCurrentIndent();
            translatedGo.append("}");
        }
    }

    @Override
    public void enterMientras(lppParser.MientrasContext ctx) {
        translatedGo.append("\n");
        String enterMientrasTranslated = "for " + convertOperators(ctx.exp().getText()) + " {\n";
        System.out.print("\n" + enterMientrasTranslated);
        printCurrentIndent();
        translatedGo.append(enterMientrasTranslated);
        increaseIndent();
    }

    @Override
    public void exitMientras(lppParser.MientrasContext ctx) {
        System.out.print("}\n\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterLlamar(lppParser.LlamarContext ctx) {
        String enterLlamarTranslated;
        if(ctx.ID().getText().equals("nueva_linea")) {
            if (codeHeader.indexOf("import \"fmt\"\n") == -1) codeHeader.append("import \"fmt\"\n");
            enterLlamarTranslated = "fmt.Println()\n";
            System.out.print(enterLlamarTranslated);
        } else {
            enterLlamarTranslated = ctx.ID() + "()\n";
            System.out.print(enterLlamarTranslated);
        }

        printCurrentIndent();
        translatedGo.append(enterLlamarTranslated);
    }

    @Override
    public void enterRepita(lppParser.RepitaContext ctx) {
        String enterRepitaTranslated = "for ok := true; ok; ok = " + convertOperators(ctx.exp().getText()) + " {\n";
        System.out.print(enterRepitaTranslated);
        printCurrentIndent();
        translatedGo.append(enterRepitaTranslated);
        increaseIndent();
    }

    @Override
    public void exitRepita(lppParser.RepitaContext ctx) {
        System.out.print("}\n\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n\n");
    }

    @Override
    public void enterPara(lppParser.ParaContext ctx) {
        String enterParaTranslated = "for " + ctx.exp().get(0).getText().toLowerCase() + " = " + ctx.exp().get(1).getText() + "; " + ctx.exp().get(0).getText().toLowerCase() + " <= " + ctx.exp().get(2).getText() + "; " + ctx.exp().get(0).getText().toLowerCase() + "++ {\n";
        System.out.print(enterParaTranslated);
        printCurrentIndent();
        increaseIndent();
        translatedGo.append(enterParaTranslated);
    }

    @Override
    public void exitPara(lppParser.ParaContext ctx) {
        System.out.print("}\n");
        decreaseIndent();
        printCurrentIndent();
        translatedGo.append("}\n");
    }
}
