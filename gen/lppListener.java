// Generated from C:/Users/itrmi/Documents/camilo_andres_gonzalez_castro/git_repositories/lpp-translator/grammar/lpp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lppParser}.
 */
public interface lppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lppParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(lppParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(lppParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_registros}.
	 * @param ctx the parse tree
	 */
	void enterDec_registros(lppParser.Dec_registrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_registros}.
	 * @param ctx the parse tree
	 */
	void exitDec_registros(lppParser.Dec_registrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_variables}.
	 * @param ctx the parse tree
	 */
	void enterDec_variables(lppParser.Dec_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_variables}.
	 * @param ctx the parse tree
	 */
	void exitDec_variables(lppParser.Dec_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_variable}.
	 * @param ctx the parse tree
	 */
	void enterDec_variable(lppParser.Dec_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_variable}.
	 * @param ctx the parse tree
	 */
	void exitDec_variable(lppParser.Dec_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_funciones}.
	 * @param ctx the parse tree
	 */
	void enterDec_funciones(lppParser.Dec_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_funciones}.
	 * @param ctx the parse tree
	 */
	void exitDec_funciones(lppParser.Dec_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDec_funcion(lppParser.Dec_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDec_funcion(lppParser.Dec_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(lppParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(lppParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void enterDec_var(lppParser.Dec_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void exitDec_var(lppParser.Dec_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#dec_procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterDec_procedimiento(lppParser.Dec_procedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#dec_procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitDec_procedimiento(lppParser.Dec_procedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(lppParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(lppParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#cmds}.
	 * @param ctx the parse tree
	 */
	void enterCmds(lppParser.CmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#cmds}.
	 * @param ctx the parse tree
	 */
	void exitCmds(lppParser.CmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#escriba}.
	 * @param ctx the parse tree
	 */
	void enterEscriba(lppParser.EscribaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#escriba}.
	 * @param ctx the parse tree
	 */
	void exitEscriba(lppParser.EscribaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#lea}.
	 * @param ctx the parse tree
	 */
	void enterLea(lppParser.LeaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#lea}.
	 * @param ctx the parse tree
	 */
	void exitLea(lppParser.LeaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#llamar}.
	 * @param ctx the parse tree
	 */
	void enterLlamar(lppParser.LlamarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#llamar}.
	 * @param ctx the parse tree
	 */
	void exitLlamar(lppParser.LlamarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(lppParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(lppParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(lppParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(lppParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(lppParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(lppParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#opcion}.
	 * @param ctx the parse tree
	 */
	void enterOpcion(lppParser.OpcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#opcion}.
	 * @param ctx the parse tree
	 */
	void exitOpcion(lppParser.OpcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#caso_sino}.
	 * @param ctx the parse tree
	 */
	void enterCaso_sino(lppParser.Caso_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#caso_sino}.
	 * @param ctx the parse tree
	 */
	void exitCaso_sino(lppParser.Caso_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#repita}.
	 * @param ctx the parse tree
	 */
	void enterRepita(lppParser.RepitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#repita}.
	 * @param ctx the parse tree
	 */
	void exitRepita(lppParser.RepitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(lppParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(lppParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(lppParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(lppParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#asigne}.
	 * @param ctx the parse tree
	 */
	void enterAsigne(lppParser.AsigneContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#asigne}.
	 * @param ctx the parse tree
	 */
	void exitAsigne(lppParser.AsigneContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#retorne}.
	 * @param ctx the parse tree
	 */
	void enterRetorne(lppParser.RetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#retorne}.
	 * @param ctx the parse tree
	 */
	void exitRetorne(lppParser.RetorneContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterExp(lppParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced.
	 * @param ctx the parse tree
	 */
	void exitExp(lppParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(lppParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(lppParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(lppParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(lppParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(lppParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(lppParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(lppParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(lppParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link lppParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(lppParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lppParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(lppParser.Exp_listContext ctx);
}