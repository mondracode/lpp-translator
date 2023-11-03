import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class LppToGoListener extends lppBaseListener{

    private ArrayList<String> requiredLibs = new ArrayList<>();

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    };

    private String getVarType(lppParser.Tipo_variableContext ctx) {
        StringBuilder result = new StringBuilder();
        String variableTipo = ctx.getText().toLowerCase();

        if(variableTipo.contains("cadena")) {
            result.append("string");
        }
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
            case "cadena":
                result.append("string");
                break;
        }

        return result.toString();
    }

    private StringBuilder translatedGo = new StringBuilder();

    public String getTranslatedJavaScript() {
        return translatedGo.toString();
    }

    @Override
    public void enterDec_registros(lppParser.Dec_registrosContext ctx) {
        String registroId = String.valueOf(ctx.ID().getFirst());
        System.out.print("type " + capitalize(registroId) + " struct {\n");
        //translatedGo.append(registro);
    }

    @Override
    public void exitDec_registros(lppParser.Dec_registrosContext ctx) {
        System.out.print("}\n\n");
        //translatedGo.append(registro);
    }

    @Override
    public void enterDec_variable(lppParser.Dec_variableContext ctx) {
        System.out.print(ctx.ID().getText().toLowerCase() + " ");
    }

    @Override
    public void enterDec_variable_global(lppParser.Dec_variable_globalContext ctx) {
        System.out.print("var " + ctx.ID().getText().toLowerCase() + " ");
    }

    @Override
    public void exitDec_variable_global(lppParser.Dec_variable_globalContext ctx) {
        System.out.print(getVarType(ctx.tipo_variable()));
        System.out.println();
    }

    @Override
    public void enterDec_sig_variable(lppParser.Dec_sig_variableContext ctx) {
        System.out.print(", " + ctx.ID().getText().toLowerCase() + " ");
    }

    @Override
    public void exitDec_variable(lppParser.Dec_variableContext ctx) {
        System.out.print(getVarType(ctx.tipo_variable()));
        System.out.println();
    }

    @Override public void enterTipo(lppParser.TipoContext ctx) {
        String variableTipo = ctx.getText();

        if(variableTipo.contains("cadena")) {
            System.out.print("string");
        }
        switch (variableTipo) {
            case "entero":
                System.out.print("int");
                break;
            case "real":
                System.out.print("float32");
                break;
            case "booleano":
                System.out.print("bool");
                break;
            case "caracter":
                System.out.print("rune");
                break;
        }
    }

    @Override
    public void enterArreglo_variable(lppParser.Arreglo_variableContext ctx) {
        System.out.print("[" + ctx.ENTERO_LITERAL().getText() + "]");
    }

    @Override
    public void enterProg(lppParser.ProgContext ctx) {
        System.out.print("\nfunc main(){\n");
    }

    @Override
    public void exitProg(lppParser.ProgContext ctx) {
        System.out.print("}");
    }

    @Override
    public void enterAsigne(lppParser.AsigneContext ctx) {
        System.out.print(ctx.exp().getFirst().getText().toLowerCase() + " = ");
    }

    @Override
    public void exitAsigne(lppParser.AsigneContext ctx) {
        System.out.println();
    }

    @Override
    public void enterLiteral(lppParser.LiteralContext ctx) {
        String literal = ctx.getText();
        switch (literal) {
            case "Verdadero":
                System.out.print("true");
                break;
            case "Falso":
                System.out.print("false");
                break;
            default:
                System.out.print(literal);
        }
    }

    public void enterEscriba(lppParser.EscribaContext ctx) {
        requiredLibs.add("fmt");
        System.out.print("fmt.Print(");
    }
}