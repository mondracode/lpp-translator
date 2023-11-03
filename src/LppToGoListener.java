public class LppToGoListener extends lppBaseListener{
    private StringBuilder translatedGo = new StringBuilder();

    public String getTranslatedGo() {
        return translatedGo.toString();
    }

    @Override
    public void enterLiteral(lppParser.LiteralContext ctx) {
        if (ctx.ENTERO_LITERAL() != null) {
            // Literal entero
            String intLiteral = ctx.ENTERO_LITERAL().getText();
            translatedGo.append(intLiteral);
            System.out.print(intLiteral);
        } else if (ctx.REAL_LITERAL() != null) {
            // Literal real
            String realLiteral = ctx.REAL_LITERAL().getText();
            realLiteral = realLiteral.replace(",", ".");
            translatedGo.append(realLiteral);
            System.out.print(realLiteral);
        } else if (ctx.CADENA_LITERAL() != null) {
            // Literal cadena
            String cadenaLiteral = ctx.CADENA_LITERAL().getText();
            translatedGo.append(cadenaLiteral);
            System.out.print(cadenaLiteral);
        } else if (ctx.BOOLEANO_LITERAL() != null) {
            // Literal booleano
            String booleanLiteral = ctx.BOOLEANO_LITERAL().getText();
            if (booleanLiteral.equals("VERDADERO")) {
                translatedGo.append("true");
                System.out.print("true");
            } else if (booleanLiteral.equals("FALSO")) {
                translatedGo.append("false");
                System.out.print("false");
            }
        } else if (ctx.CHAR_LITERAL() != null) {
            // Literal char
            String charLiteral = ctx.CHAR_LITERAL().getText();
            translatedGo.append(charLiteral);
            System.out.print(charLiteral);
        }
    }

    @Override
    public void enterExp(lppParser.ExpContext ctx) {
        String operator = ctx.OPERATOR().getText();

        switch (operator) {
            case "+":
                translatedGo.append(" + ");
                break;
            case "-":
                translatedGo.append(" - ");
                break;
            case "*":
                translatedGo.append(" * ");
                break;
            case "/", "DIV":
                translatedGo.append(" / ");
                break;
            case "^":
                translatedGo.append(" ^ ");
                break;
            case "=":
                translatedGo.append(" == ");
                break;
            case "<>":
                translatedGo.append(" != ");
                break;
            case "<":
                translatedGo.append(" < ");
                break;
            case "<=":
                translatedGo.append(" <= ");
                break;
            case ">":
                translatedGo.append(" > ");
                break;
            case ">=":
                translatedGo.append(" >= ");
                break;
            case "MOD":
                translatedGo.append(" % ");
                break;
            default:
                break;
        }
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