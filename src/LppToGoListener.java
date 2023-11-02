public class LppToGoListener extends lppBaseListener{
    private StringBuilder translatedGo = new StringBuilder();

    public String getTranslatedJavaScript() {
        return translatedGo.toString();
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