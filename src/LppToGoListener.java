import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LppToGoListener extends lppBaseListener{

    private ArrayList<String> requiredLibs = new ArrayList<>();
    private ArrayList<String> globalVariables = new ArrayList<>();

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

    @Override
    public void enterDec_registros(lppParser.Dec_registrosContext ctx) {
        String registroId = String.valueOf(ctx.ID().get(0));
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
    public void enterProg_main(lppParser.Prog_mainContext ctx) {
        System.out.print("\nfunc main(){\n");
    }

    @Override
    public void exitProg_main(lppParser.Prog_mainContext ctx) {
        System.out.print("}");
    }

    @Override
    public void enterAsigne(lppParser.AsigneContext ctx) {
        System.out.print(ctx.exp().get(0).getText().toLowerCase() + " = ");
    }

    @Override
    public void exitAsigne(lppParser.AsigneContext ctx) {
        String exp = ctx.exp().get(1).getText();

        if(ctx.exp().get(1).ID() != null) {
            exp = exp.toLowerCase();
        }

        System.out.println(exp.replace("<>", "!="));
    }

    @Override
    public void enterExp_list(lppParser.Exp_listContext ctx) {
        for (int i = 0; i < ctx.exp().size() - 1; i++) {
            String exp = ctx.exp().get(i).getText();
            if(ctx.exp().get(i).ID() != null) {
                exp = exp.toLowerCase();
            }

            System.out.print(exp + ", ");
        }

        System.out.print(ctx.exp().get(ctx.exp().size() - 1).getText());
    }

    @Override
    public void enterEscriba(lppParser.EscribaContext ctx) {
        requiredLibs.add("fmt");
        System.out.print("\nfmt.Print(");
    }

    @Override
    public void exitEscriba(lppParser.EscribaContext ctx) {
        System.out.print(")\n");
    }
    @Override
    public void enterRetorne(lppParser.RetorneContext ctx) {
        System.out.println("return " + ctx.exp().getText());
    }

    @Override
    public void enterDec_funcion(lppParser.Dec_funcionContext ctx) {
        System.out.println();
        System.out.print("func " + ctx.ID().getText());
    }

    @Override
    public void exitDec_funcion(lppParser.Dec_funcionContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterParametros(lppParser.ParametrosContext ctx) {
        System.out.print("(");

    }

    @Override
    public void exitParametros(lppParser.ParametrosContext ctx) {
        System.out.print(") ");

    }

    @Override
    public void enterProg(lppParser.ProgContext ctx) {
        System.out.println(" {");
    }

    @Override
    public void enterParametro_sig(lppParser.Parametro_sigContext ctx) {
        System.out.print(", ");

    }

    @Override
    public void enterDec_var(lppParser.Dec_varContext ctx) {
        if(ctx.VAR() != null) {
            globalVariables.add(ctx.ID().getText());
        }

        System.out.print(ctx.ID().getText() + " ");
    }

}
