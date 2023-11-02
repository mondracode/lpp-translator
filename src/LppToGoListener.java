import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class LppToGoListener extends lppBaseListener{

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    };

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
        System.out.print(ctx.ID().getText());
    }

    @Override
    public void enterDec_variable_global(lppParser.Dec_variable_globalContext ctx) {
        System.out.print("var " + ctx.ID().getText());
    }

    @Override
    public void exitDec_variable_global(lppParser.Dec_variable_globalContext ctx) {
        String variableTipo = ctx.tipo_variable().getText().toLowerCase();

        if(!variableTipo.contains("arreglo")) {
            System.out.print(" ");
        }

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
            case "cadena":
                System.out.print("string");
                break;
        }
        System.out.println();
    }

    @Override
    public void enterDec_sig_variable(lppParser.Dec_sig_variableContext ctx) {
        System.out.print(", " + ctx.ID().getText());
    }

    @Override
    public void exitDec_variable(lppParser.Dec_variableContext ctx) {
        String variableTipo = ctx.tipo_variable().getText().toLowerCase();

        if(!variableTipo.contains("arreglo")) {
            System.out.print(" ");
        }

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
            case "cadena":
                System.out.print("string");
                break;
        }

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
        System.out.print(" [" + ctx.ENTERO_LITERAL().getText() + "]");
    }

    @Override
    public void exitDec_funcion(lppParser.Dec_funcionContext ctx) {
        String funcionId = ctx.ID().getText();
        //translatedGo.append("function ").append(funcionId).append("() {\n");
        // Aquí puedes agregar el código para traducir el interior de la función
        // No olvides cerrar la función con '}' al final
        //translatedGo.append("}\n");
    }

    @Override
    public void exitAsigne(lppParser.AsigneContext ctx) {
        // String variable = ctx.ID().getText();
        // String valor = ctx.exp().getText();
        // translatedJavaScript.append(variable).append(" = ").append(valor).append(";\n");
    }

    @Override
    public void exitEscriba(lppParser.EscribaContext ctx) {
        //String expresion = ctx.exp_list().getText();
        //translatedJavaScript.append("console.log(").append(expresion).append(");\n");
    }
}