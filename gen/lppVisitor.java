// Generated from C:/Users/USUARIO/Documents/UN/Lenguajes/Traductor/grammar/lpp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lppParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(lppParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_registros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_registros(lppParser.Dec_registrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_variables_globales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variables_globales(lppParser.Dec_variables_globalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variables(lppParser.Dec_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variable(lppParser.Dec_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_variable_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variable_global(lppParser.Dec_variable_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_sig_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_sig_variable(lppParser.Dec_sig_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_funciones(lppParser.Dec_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_funcion(lppParser.Dec_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(lppParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#parametro_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro_sig(lppParser.Parametro_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_var(lppParser.Dec_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#dec_procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_procedimiento(lppParser.Dec_procedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(lppParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#prog_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_main(lppParser.Prog_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmds(lppParser.CmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#escriba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscriba(lppParser.EscribaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#lea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLea(lppParser.LeaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#llamar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar(lppParser.LlamarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(lppParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(lppParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(lppParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#opcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion(lppParser.OpcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#caso_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso_sino(lppParser.Caso_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#repita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepita(lppParser.RepitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(lppParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(lppParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#asigne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigne(lppParser.AsigneContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#retorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorne(lppParser.RetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(lppParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(lppParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(lppParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(lppParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#tipo_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_variable(lppParser.Tipo_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(lppParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(lppParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#arreglo_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo_variable(lppParser.Arreglo_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lppParser#exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list(lppParser.Exp_listContext ctx);
}