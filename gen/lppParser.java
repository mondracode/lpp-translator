// Generated from C:/Users/smggu/OneDrive/Documentos/github.com/mondracode/lpp-translator/grammar/lpp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TKN_COMMA=1, TKN_COLON=2, TKN_OPENING_PAR=3, TKN_CLOSING_PAR=4, TKN_ASSIGN=5, 
		TKN_OPENING_BRA=6, TKN_CLOSING_BRA=7, TKN_PERIOD=8, TKN_SINGLE_QUOTE=9, 
		TKN_DOUBLE_QUOTE=10, REGISTRO=11, FIN=12, FUNCION=13, VAR=14, PROCEDIMIENTO=15, 
		INICIO=16, ESCRIBA=17, LEA=18, LLAMAR=19, SI=20, ENTONCES=21, SINO=22, 
		CASO=23, REPITA=24, HASTA=25, PARA=26, MIENTRAS=27, RETORNE=28, ENTERO=29, 
		REAL=30, BOOLEANO=31, CARACTER=32, CADENA=33, ARREGLO=34, HAGA=35, DE=36, 
		OPERATOR=37, TKN_PLUS=38, TKN_MINUS=39, TKN_TIMES=40, TKN_DIV=41, TKN_POWER=42, 
		TKN_EQUAL=43, TKN_NEQ=44, TKN_LESS=45, TKN_LEQ=46, TKN_GREATER=47, TKN_GEQ=48, 
		TKN_DIV_INT=49, TKN_MOD=50, CHAR_LITERAL=51, CADENA_LITERAL=52, ENTERO_LITERAL=53, 
		REAL_LITERAL=54, BOOLEANO_LITERAL=55, VERDADERO=56, FALSO=57, ID=58, SHORT_COMMENT=59, 
		LONG_COMMENT=60, TABS=61, NUEVA_LINEA=62;
	public static final int
		RULE_s = 0, RULE_dec_registros = 1, RULE_dec_variables_globales = 2, RULE_dec_variables = 3, 
		RULE_dec_variable = 4, RULE_dec_variable_global = 5, RULE_dec_sig_variable = 6, 
		RULE_dec_funciones = 7, RULE_dec_funcion = 8, RULE_parametros = 9, RULE_parametro_sig = 10, 
		RULE_dec_var = 11, RULE_dec_procedimiento = 12, RULE_prog = 13, RULE_prog_main = 14, 
		RULE_cmds = 15, RULE_escriba = 16, RULE_lea = 17, RULE_llamar = 18, RULE_si = 19, 
		RULE_sino = 20, RULE_caso = 21, RULE_opcion = 22, RULE_caso_sino = 23, 
		RULE_repita = 24, RULE_para = 25, RULE_mientras = 26, RULE_asigne = 27, 
		RULE_retorne = 28, RULE_exp = 29, RULE_operator = 30, RULE_literal = 31, 
		RULE_tipo = 32, RULE_tipo_variable = 33, RULE_cadena = 34, RULE_arreglo = 35, 
		RULE_arreglo_variable = 36, RULE_exp_list = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "dec_registros", "dec_variables_globales", "dec_variables", "dec_variable", 
			"dec_variable_global", "dec_sig_variable", "dec_funciones", "dec_funcion", 
			"parametros", "parametro_sig", "dec_var", "dec_procedimiento", "prog", 
			"prog_main", "cmds", "escriba", "lea", "llamar", "si", "sino", "caso", 
			"opcion", "caso_sino", "repita", "para", "mientras", "asigne", "retorne", 
			"exp", "operator", "literal", "tipo", "tipo_variable", "cadena", "arreglo", 
			"arreglo_variable", "exp_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'('", "')'", "'<-'", "'['", "']'", "'.'", "'''", 
			"'\"'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", "'<>'", 
			"'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TKN_COMMA", "TKN_COLON", "TKN_OPENING_PAR", "TKN_CLOSING_PAR", 
			"TKN_ASSIGN", "TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_PERIOD", "TKN_SINGLE_QUOTE", 
			"TKN_DOUBLE_QUOTE", "REGISTRO", "FIN", "FUNCION", "VAR", "PROCEDIMIENTO", 
			"INICIO", "ESCRIBA", "LEA", "LLAMAR", "SI", "ENTONCES", "SINO", "CASO", 
			"REPITA", "HASTA", "PARA", "MIENTRAS", "RETORNE", "ENTERO", "REAL", "BOOLEANO", 
			"CARACTER", "CADENA", "ARREGLO", "HAGA", "DE", "OPERATOR", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_EQUAL", "TKN_NEQ", 
			"TKN_LESS", "TKN_LEQ", "TKN_GREATER", "TKN_GEQ", "TKN_DIV_INT", "TKN_MOD", 
			"CHAR_LITERAL", "CADENA_LITERAL", "ENTERO_LITERAL", "REAL_LITERAL", "BOOLEANO_LITERAL", 
			"VERDADERO", "FALSO", "ID", "SHORT_COMMENT", "LONG_COMMENT", "TABS", 
			"NUEVA_LINEA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public Dec_registrosContext dec_registros() {
			return getRuleContext(Dec_registrosContext.class,0);
		}
		public Dec_variables_globalesContext dec_variables_globales() {
			return getRuleContext(Dec_variables_globalesContext.class,0);
		}
		public Dec_funcionesContext dec_funciones() {
			return getRuleContext(Dec_funcionesContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			dec_registros();
			setState(77);
			dec_variables_globales();
			setState(78);
			dec_funciones();
			setState(79);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_registrosContext extends ParserRuleContext {
		public List<TerminalNode> REGISTRO() { return getTokens(lppParser.REGISTRO); }
		public TerminalNode REGISTRO(int i) {
			return getToken(lppParser.REGISTRO, i);
		}
		public List<TerminalNode> ID() { return getTokens(lppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lppParser.ID, i);
		}
		public List<Dec_variablesContext> dec_variables() {
			return getRuleContexts(Dec_variablesContext.class);
		}
		public Dec_variablesContext dec_variables(int i) {
			return getRuleContext(Dec_variablesContext.class,i);
		}
		public List<TerminalNode> FIN() { return getTokens(lppParser.FIN); }
		public TerminalNode FIN(int i) {
			return getToken(lppParser.FIN, i);
		}
		public Dec_registrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_registros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_registros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_registros(this);
		}
	}

	public final Dec_registrosContext dec_registros() throws RecognitionException {
		Dec_registrosContext _localctx = new Dec_registrosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec_registros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REGISTRO) {
				{
				{
				setState(81);
				match(REGISTRO);
				setState(82);
				match(ID);
				setState(83);
				dec_variables();
				setState(84);
				match(FIN);
				setState(85);
				match(REGISTRO);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variables_globalesContext extends ParserRuleContext {
		public List<Dec_variable_globalContext> dec_variable_global() {
			return getRuleContexts(Dec_variable_globalContext.class);
		}
		public Dec_variable_globalContext dec_variable_global(int i) {
			return getRuleContext(Dec_variable_globalContext.class,i);
		}
		public Dec_variables_globalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variables_globales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_variables_globales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_variables_globales(this);
		}
	}

	public final Dec_variables_globalesContext dec_variables_globales() throws RecognitionException {
		Dec_variables_globalesContext _localctx = new Dec_variables_globalesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec_variables_globales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) {
				{
				{
				setState(92);
				dec_variable_global();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variablesContext extends ParserRuleContext {
		public List<Dec_variableContext> dec_variable() {
			return getRuleContexts(Dec_variableContext.class);
		}
		public Dec_variableContext dec_variable(int i) {
			return getRuleContext(Dec_variableContext.class,i);
		}
		public Dec_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_variables(this);
		}
	}

	public final Dec_variablesContext dec_variables() throws RecognitionException {
		Dec_variablesContext _localctx = new Dec_variablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) {
				{
				{
				setState(98);
				dec_variable();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variableContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public List<Dec_sig_variableContext> dec_sig_variable() {
			return getRuleContexts(Dec_sig_variableContext.class);
		}
		public Dec_sig_variableContext dec_sig_variable(int i) {
			return getRuleContext(Dec_sig_variableContext.class,i);
		}
		public Dec_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_variable(this);
		}
	}

	public final Dec_variableContext dec_variable() throws RecognitionException {
		Dec_variableContext _localctx = new Dec_variableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			tipo_variable();
			setState(105);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_COMMA) {
				{
				{
				setState(106);
				dec_sig_variable();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variable_globalContext extends ParserRuleContext {
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public List<Dec_sig_variableContext> dec_sig_variable() {
			return getRuleContexts(Dec_sig_variableContext.class);
		}
		public Dec_sig_variableContext dec_sig_variable(int i) {
			return getRuleContext(Dec_sig_variableContext.class,i);
		}
		public Dec_variable_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variable_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_variable_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_variable_global(this);
		}
	}

	public final Dec_variable_globalContext dec_variable_global() throws RecognitionException {
		Dec_variable_globalContext _localctx = new Dec_variable_globalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec_variable_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			tipo_variable();
			setState(113);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_COMMA) {
				{
				{
				setState(114);
				dec_sig_variable();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_sig_variableContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(lppParser.TKN_COMMA, 0); }
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public Dec_sig_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_sig_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_sig_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_sig_variable(this);
		}
	}

	public final Dec_sig_variableContext dec_sig_variable() throws RecognitionException {
		Dec_sig_variableContext _localctx = new Dec_sig_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec_sig_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TKN_COMMA);
			setState(121);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_funcionesContext extends ParserRuleContext {
		public List<Dec_funcionContext> dec_funcion() {
			return getRuleContexts(Dec_funcionContext.class);
		}
		public Dec_funcionContext dec_funcion(int i) {
			return getRuleContext(Dec_funcionContext.class,i);
		}
		public List<Dec_procedimientoContext> dec_procedimiento() {
			return getRuleContexts(Dec_procedimientoContext.class);
		}
		public Dec_procedimientoContext dec_procedimiento(int i) {
			return getRuleContext(Dec_procedimientoContext.class,i);
		}
		public Dec_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_funciones(this);
		}
	}

	public final Dec_funcionesContext dec_funciones() throws RecognitionException {
		Dec_funcionesContext _localctx = new Dec_funcionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION || _la==PROCEDIMIENTO) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCION:
					{
					setState(123);
					dec_funcion();
					}
					break;
				case PROCEDIMIENTO:
					{
					setState(124);
					dec_procedimiento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_funcionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(lppParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode TKN_COLON() { return getToken(lppParser.TKN_COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_variablesContext dec_variables() {
			return getRuleContext(Dec_variablesContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public Dec_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_funcion(this);
		}
	}

	public final Dec_funcionContext dec_funcion() throws RecognitionException {
		Dec_funcionContext _localctx = new Dec_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dec_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FUNCION);
			setState(131);
			match(ID);
			setState(132);
			parametros();
			setState(133);
			match(TKN_COLON);
			setState(134);
			tipo();
			setState(135);
			dec_variables();
			setState(136);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(lppParser.TKN_OPENING_PAR, 0); }
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(lppParser.TKN_CLOSING_PAR, 0); }
		public List<Parametro_sigContext> parametro_sig() {
			return getRuleContexts(Parametro_sigContext.class);
		}
		public Parametro_sigContext parametro_sig(int i) {
			return getRuleContext(Parametro_sigContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_OPENING_PAR) {
				{
				setState(138);
				match(TKN_OPENING_PAR);
				setState(139);
				dec_var();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_COMMA) {
					{
					{
					setState(140);
					parametro_sig();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(TKN_CLOSING_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parametro_sigContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(lppParser.TKN_COMMA, 0); }
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public Parametro_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro_sig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterParametro_sig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitParametro_sig(this);
		}
	}

	public final Parametro_sigContext parametro_sig() throws RecognitionException {
		Parametro_sigContext _localctx = new Parametro_sigContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametro_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(TKN_COMMA);
			setState(151);
			dec_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_varContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public TerminalNode VAR() { return getToken(lppParser.VAR, 0); }
		public Dec_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_var(this);
		}
	}

	public final Dec_varContext dec_var() throws RecognitionException {
		Dec_varContext _localctx = new Dec_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dec_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(153);
				match(VAR);
				}
			}

			setState(156);
			tipo();
			setState(157);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_procedimientoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMIENTO() { return getToken(lppParser.PROCEDIMIENTO, 0); }
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Dec_variablesContext dec_variables() {
			return getRuleContext(Dec_variablesContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public Dec_procedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterDec_procedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitDec_procedimiento(this);
		}
	}

	public final Dec_procedimientoContext dec_procedimiento() throws RecognitionException {
		Dec_procedimientoContext _localctx = new Dec_procedimientoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dec_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(PROCEDIMIENTO);
			setState(160);
			match(ID);
			setState(161);
			parametros();
			setState(162);
			dec_variables();
			setState(163);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(lppParser.INICIO, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(INICIO);
			setState(166);
			cmds();
			setState(167);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prog_mainContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(lppParser.INICIO, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public Prog_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterProg_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitProg_main(this);
		}
	}

	public final Prog_mainContext prog_main() throws RecognitionException {
		Prog_mainContext _localctx = new Prog_mainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prog_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(INICIO);
			setState(170);
			cmds();
			setState(171);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdsContext extends ParserRuleContext {
		public List<EscribaContext> escriba() {
			return getRuleContexts(EscribaContext.class);
		}
		public EscribaContext escriba(int i) {
			return getRuleContext(EscribaContext.class,i);
		}
		public List<LeaContext> lea() {
			return getRuleContexts(LeaContext.class);
		}
		public LeaContext lea(int i) {
			return getRuleContext(LeaContext.class,i);
		}
		public List<LlamarContext> llamar() {
			return getRuleContexts(LlamarContext.class);
		}
		public LlamarContext llamar(int i) {
			return getRuleContext(LlamarContext.class,i);
		}
		public List<SiContext> si() {
			return getRuleContexts(SiContext.class);
		}
		public SiContext si(int i) {
			return getRuleContext(SiContext.class,i);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public List<RepitaContext> repita() {
			return getRuleContexts(RepitaContext.class);
		}
		public RepitaContext repita(int i) {
			return getRuleContext(RepitaContext.class,i);
		}
		public List<ParaContext> para() {
			return getRuleContexts(ParaContext.class);
		}
		public ParaContext para(int i) {
			return getRuleContext(ParaContext.class,i);
		}
		public List<MientrasContext> mientras() {
			return getRuleContexts(MientrasContext.class);
		}
		public MientrasContext mientras(int i) {
			return getRuleContext(MientrasContext.class,i);
		}
		public List<AsigneContext> asigne() {
			return getRuleContexts(AsigneContext.class);
		}
		public AsigneContext asigne(int i) {
			return getRuleContext(AsigneContext.class,i);
		}
		public List<RetorneContext> retorne() {
			return getRuleContexts(RetorneContext.class);
		}
		public RetorneContext retorne(int i) {
			return getRuleContext(RetorneContext.class,i);
		}
		public CmdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitCmds(this);
		}
	}

	public final CmdsContext cmds() throws RecognitionException {
		CmdsContext _localctx = new CmdsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ESCRIBA:
						{
						setState(173);
						escriba();
						}
						break;
					case LEA:
						{
						setState(174);
						lea();
						}
						break;
					case LLAMAR:
						{
						setState(175);
						llamar();
						}
						break;
					case SI:
						{
						setState(176);
						si();
						}
						break;
					case CASO:
						{
						setState(177);
						caso();
						}
						break;
					case REPITA:
						{
						setState(178);
						repita();
						}
						break;
					case PARA:
						{
						setState(179);
						para();
						}
						break;
					case MIENTRAS:
						{
						setState(180);
						mientras();
						}
						break;
					case TKN_OPENING_PAR:
					case TKN_MINUS:
					case CHAR_LITERAL:
					case CADENA_LITERAL:
					case ENTERO_LITERAL:
					case REAL_LITERAL:
					case BOOLEANO_LITERAL:
					case ID:
						{
						setState(181);
						asigne();
						}
						break;
					case RETORNE:
						{
						setState(182);
						retorne();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscribaContext extends ParserRuleContext {
		public TerminalNode ESCRIBA() { return getToken(lppParser.ESCRIBA, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public EscribaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterEscriba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitEscriba(this);
		}
	}

	public final EscribaContext escriba() throws RecognitionException {
		EscribaContext _localctx = new EscribaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_escriba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ESCRIBA);
			setState(189);
			exp_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeaContext extends ParserRuleContext {
		public TerminalNode LEA() { return getToken(lppParser.LEA, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public LeaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterLea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitLea(this);
		}
	}

	public final LeaContext lea() throws RecognitionException {
		LeaContext _localctx = new LeaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LEA);
			setState(192);
			exp_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamarContext extends ParserRuleContext {
		public TerminalNode LLAMAR() { return getToken(lppParser.LLAMAR, 0); }
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(lppParser.TKN_OPENING_PAR, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(lppParser.TKN_CLOSING_PAR, 0); }
		public LlamarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterLlamar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitLlamar(this);
		}
	}

	public final LlamarContext llamar() throws RecognitionException {
		LlamarContext _localctx = new LlamarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LLAMAR);
			setState(195);
			match(ID);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(196);
				match(TKN_OPENING_PAR);
				setState(197);
				exp_list();
				setState(198);
				match(TKN_CLOSING_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(lppParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(lppParser.SI, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(lppParser.ENTONCES, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(SI);
			setState(203);
			exp(0);
			setState(204);
			match(ENTONCES);
			setState(205);
			cmds();
			setState(206);
			sino();
			setState(207);
			match(FIN);
			setState(208);
			match(SI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(lppParser.SINO, 0); }
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitSino(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(210);
				match(SINO);
				setState(211);
				si();
				}
				break;
			case 2:
				{
				setState(212);
				match(SINO);
				setState(213);
				cmds();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public List<TerminalNode> CASO() { return getTokens(lppParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(lppParser.CASO, i);
		}
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public List<OpcionContext> opcion() {
			return getRuleContexts(OpcionContext.class);
		}
		public OpcionContext opcion(int i) {
			return getRuleContext(OpcionContext.class,i);
		}
		public Caso_sinoContext caso_sino() {
			return getRuleContext(Caso_sinoContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitCaso(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CASO);
			setState(217);
			match(ID);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				opcion();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 358036720131768328L) != 0) );
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(223);
				caso_sino();
				}
			}

			setState(226);
			match(FIN);
			setState(227);
			match(CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcionContext extends ParserRuleContext {
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode TKN_COLON() { return getToken(lppParser.TKN_COLON, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public OpcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterOpcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitOpcion(this);
		}
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			exp_list();
			setState(230);
			match(TKN_COLON);
			setState(231);
			cmds();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Caso_sinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(lppParser.SINO, 0); }
		public TerminalNode TKN_COLON() { return getToken(lppParser.TKN_COLON, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public Caso_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterCaso_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitCaso_sino(this);
		}
	}

	public final Caso_sinoContext caso_sino() throws RecognitionException {
		Caso_sinoContext _localctx = new Caso_sinoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caso_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SINO);
			setState(234);
			match(TKN_COLON);
			setState(235);
			cmds();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepitaContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(lppParser.REPITA, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(lppParser.HASTA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitRepita(this);
		}
	}

	public final RepitaContext repita() throws RecognitionException {
		RepitaContext _localctx = new RepitaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_repita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(REPITA);
			setState(238);
			cmds();
			setState(239);
			match(HASTA);
			setState(240);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public List<TerminalNode> PARA() { return getTokens(lppParser.PARA); }
		public TerminalNode PARA(int i) {
			return getToken(lppParser.PARA, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TKN_ASSIGN() { return getToken(lppParser.TKN_ASSIGN, 0); }
		public TerminalNode HASTA() { return getToken(lppParser.HASTA, 0); }
		public TerminalNode HAGA() { return getToken(lppParser.HAGA, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PARA);
			setState(243);
			exp(0);
			setState(244);
			match(TKN_ASSIGN);
			setState(245);
			exp(0);
			setState(246);
			match(HASTA);
			setState(247);
			exp(0);
			setState(248);
			match(HAGA);
			setState(249);
			cmds();
			setState(250);
			match(FIN);
			setState(251);
			match(PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasContext extends ParserRuleContext {
		public List<TerminalNode> MIENTRAS() { return getTokens(lppParser.MIENTRAS); }
		public TerminalNode MIENTRAS(int i) {
			return getToken(lppParser.MIENTRAS, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode HAGA() { return getToken(lppParser.HAGA, 0); }
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode FIN() { return getToken(lppParser.FIN, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(MIENTRAS);
			setState(254);
			exp(0);
			setState(255);
			match(HAGA);
			setState(256);
			cmds();
			setState(257);
			match(FIN);
			setState(258);
			match(MIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigneContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TKN_ASSIGN() { return getToken(lppParser.TKN_ASSIGN, 0); }
		public AsigneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterAsigne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitAsigne(this);
		}
	}

	public final AsigneContext asigne() throws RecognitionException {
		AsigneContext _localctx = new AsigneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_asigne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			exp(0);
			setState(261);
			match(TKN_ASSIGN);
			setState(262);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(lppParser.RETORNE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitRetorne(this);
		}
	}

	public final RetorneContext retorne() throws RecognitionException {
		RetorneContext _localctx = new RetorneContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(RETORNE);
			setState(265);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(lppParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(lppParser.TKN_OPENING_PAR, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(lppParser.TKN_CLOSING_PAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode TKN_MINUS() { return getToken(lppParser.TKN_MINUS, 0); }
		public TerminalNode TKN_OPENING_BRA() { return getToken(lppParser.TKN_OPENING_BRA, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(lppParser.TKN_CLOSING_BRA, 0); }
		public TerminalNode TKN_PERIOD() { return getToken(lppParser.TKN_PERIOD, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(268);
				literal();
				}
				break;
			case 2:
				{
				setState(269);
				match(ID);
				}
				break;
			case 3:
				{
				setState(270);
				match(ID);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(271);
					match(TKN_OPENING_PAR);
					setState(272);
					exp_list();
					setState(273);
					match(TKN_CLOSING_PAR);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(277);
				match(TKN_OPENING_PAR);
				setState(278);
				exp(0);
				setState(279);
				match(TKN_CLOSING_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(283);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(284);
						operator();
						setState(285);
						exp(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						match(TKN_MINUS);
						setState(289);
						exp(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(291);
						match(TKN_OPENING_BRA);
						setState(292);
						exp_list();
						setState(293);
						match(TKN_CLOSING_BRA);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(295);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(296);
						match(TKN_PERIOD);
						setState(297);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(lppParser.OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(lppParser.CHAR_LITERAL, 0); }
		public TerminalNode CADENA_LITERAL() { return getToken(lppParser.CADENA_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(lppParser.REAL_LITERAL, 0); }
		public TerminalNode ENTERO_LITERAL() { return getToken(lppParser.ENTERO_LITERAL, 0); }
		public TerminalNode TKN_MINUS() { return getToken(lppParser.TKN_MINUS, 0); }
		public TerminalNode BOOLEANO_LITERAL() { return getToken(lppParser.BOOLEANO_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(CADENA_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(REAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(ENTERO_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(TKN_MINUS);
				setState(310);
				match(REAL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(TKN_MINUS);
				setState(312);
				match(ENTERO_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				match(BOOLEANO_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(lppParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(lppParser.REAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(lppParser.BOOLEANO, 0); }
		public TerminalNode CARACTER() { return getToken(lppParser.CARACTER, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tipo);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ENTERO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(REAL);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(BOOLEANO);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(CARACTER);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				cadena();
				}
				break;
			case ARREGLO:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				arreglo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_variableContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(lppParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(lppParser.REAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(lppParser.BOOLEANO, 0); }
		public TerminalNode CARACTER() { return getToken(lppParser.CARACTER, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Arreglo_variableContext arreglo_variable() {
			return getRuleContext(Arreglo_variableContext.class,0);
		}
		public Tipo_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterTipo_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitTipo_variable(this);
		}
	}

	public final Tipo_variableContext tipo_variable() throws RecognitionException {
		Tipo_variableContext _localctx = new Tipo_variableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipo_variable);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ENTERO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(REAL);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(BOOLEANO);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(CARACTER);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				cadena();
				}
				break;
			case ARREGLO:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				arreglo_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(lppParser.CADENA, 0); }
		public TerminalNode TKN_OPENING_BRA() { return getToken(lppParser.TKN_OPENING_BRA, 0); }
		public TerminalNode ENTERO_LITERAL() { return getToken(lppParser.ENTERO_LITERAL, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(lppParser.TKN_CLOSING_BRA, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(CADENA);
			setState(333);
			match(TKN_OPENING_BRA);
			setState(334);
			match(ENTERO_LITERAL);
			setState(335);
			match(TKN_CLOSING_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode ARREGLO() { return getToken(lppParser.ARREGLO, 0); }
		public TerminalNode TKN_OPENING_BRA() { return getToken(lppParser.TKN_OPENING_BRA, 0); }
		public TerminalNode ENTERO_LITERAL() { return getToken(lppParser.ENTERO_LITERAL, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(lppParser.TKN_CLOSING_BRA, 0); }
		public TerminalNode DE() { return getToken(lppParser.DE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitArreglo(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ARREGLO);
			setState(338);
			match(TKN_OPENING_BRA);
			setState(339);
			match(ENTERO_LITERAL);
			setState(340);
			match(TKN_CLOSING_BRA);
			setState(341);
			match(DE);
			setState(342);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arreglo_variableContext extends ParserRuleContext {
		public TerminalNode ARREGLO() { return getToken(lppParser.ARREGLO, 0); }
		public TerminalNode TKN_OPENING_BRA() { return getToken(lppParser.TKN_OPENING_BRA, 0); }
		public TerminalNode ENTERO_LITERAL() { return getToken(lppParser.ENTERO_LITERAL, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(lppParser.TKN_CLOSING_BRA, 0); }
		public TerminalNode DE() { return getToken(lppParser.DE, 0); }
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public Arreglo_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterArreglo_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitArreglo_variable(this);
		}
	}

	public final Arreglo_variableContext arreglo_variable() throws RecognitionException {
		Arreglo_variableContext _localctx = new Arreglo_variableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arreglo_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ARREGLO);
			setState(345);
			match(TKN_OPENING_BRA);
			setState(346);
			match(ENTERO_LITERAL);
			setState(347);
			match(TKN_CLOSING_BRA);
			setState(348);
			match(DE);
			setState(349);
			tipo_variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_listContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> TKN_COMMA() { return getTokens(lppParser.TKN_COMMA); }
		public TerminalNode TKN_COMMA(int i) {
			return getToken(lppParser.TKN_COMMA, i);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lppListener ) ((lppListener)listener).exitExp_list(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			exp(0);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_COMMA) {
				{
				{
				setState(352);
				match(TKN_COMMA);
				setState(353);
				exp(0);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0168\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001[\t\u0001"+
		"\u0001\u0002\u0005\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0003"+
		"\u0005\u0003d\b\u0003\n\u0003\f\u0003g\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"~\b\u0007\n\u0007\f\u0007\u0081\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u008e"+
		"\b\t\n\t\f\t\u0091\t\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b8\b\u000f\n"+
		"\u000f\f\u000f\u00bb\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c9\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d7"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u00dc\b\u0015"+
		"\u000b\u0015\f\u0015\u00dd\u0001\u0015\u0003\u0015\u00e1\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0114\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u011a\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u012b\b\u001d\n\u001d\f\u001d\u012e\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013b\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0143\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u014b\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u0163"+
		"\b%\n%\f%\u0166\t%\u0001%\u0000\u0001:&\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJ\u0000\u0000\u0173\u0000L\u0001\u0000\u0000\u0000\u0002Y\u0001"+
		"\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000"+
		"\u0000\bh\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fx\u0001"+
		"\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0082\u0001"+
		"\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u0096\u0001"+
		"\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009f\u0001"+
		"\u0000\u0000\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00a9\u0001"+
		"\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000"+
		"\u0000\u0000\"\u00bf\u0001\u0000\u0000\u0000$\u00c2\u0001\u0000\u0000"+
		"\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000*"+
		"\u00d8\u0001\u0000\u0000\u0000,\u00e5\u0001\u0000\u0000\u0000.\u00e9\u0001"+
		"\u0000\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00f2\u0001\u0000\u0000"+
		"\u00004\u00fd\u0001\u0000\u0000\u00006\u0104\u0001\u0000\u0000\u00008"+
		"\u0108\u0001\u0000\u0000\u0000:\u0119\u0001\u0000\u0000\u0000<\u012f\u0001"+
		"\u0000\u0000\u0000>\u013a\u0001\u0000\u0000\u0000@\u0142\u0001\u0000\u0000"+
		"\u0000B\u014a\u0001\u0000\u0000\u0000D\u014c\u0001\u0000\u0000\u0000F"+
		"\u0151\u0001\u0000\u0000\u0000H\u0158\u0001\u0000\u0000\u0000J\u015f\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0003\u0004\u0002\u0000"+
		"NO\u0003\u000e\u0007\u0000OP\u0003\u001a\r\u0000P\u0001\u0001\u0000\u0000"+
		"\u0000QR\u0005\u000b\u0000\u0000RS\u0005:\u0000\u0000ST\u0003\u0006\u0003"+
		"\u0000TU\u0005\f\u0000\u0000UV\u0005\u000b\u0000\u0000VX\u0001\u0000\u0000"+
		"\u0000WQ\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\^\u0003\n\u0005\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u0005\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bd\u0003\b\u0004\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0007\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003B!\u0000im\u0005:\u0000"+
		"\u0000jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\t\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003B!\u0000qu\u0005:\u0000"+
		"\u0000rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u000b\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0001\u0000\u0000"+
		"yz\u0005:\u0000\u0000z\r\u0001\u0000\u0000\u0000{~\u0003\u0010\b\u0000"+
		"|~\u0003\u0018\f\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0084\u0005"+
		":\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0086\u0005\u0002"+
		"\u0000\u0000\u0086\u0087\u0003@ \u0000\u0087\u0088\u0003\u0006\u0003\u0000"+
		"\u0088\u0089\u0003\u001a\r\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0003\u0000\u0000\u008b\u008f\u0003\u0016\u000b\u0000\u008c"+
		"\u008e\u0003\u0014\n\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u0001\u0000\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u0015"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u000e\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0003@ \u0000\u009d\u009e\u0005:"+
		"\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f"+
		"\u0000\u0000\u00a0\u00a1\u0005:\u0000\u0000\u00a1\u00a2\u0003\u0012\t"+
		"\u0000\u00a2\u00a3\u0003\u0006\u0003\u0000\u00a3\u00a4\u0003\u001a\r\u0000"+
		"\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000"+
		"\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005\f\u0000\u0000\u00a8"+
		"\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000\u00aa"+
		"\u00ab\u0003\u001e\u000f\u0000\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u001d"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b8\u0003 \u0010\u0000\u00ae\u00b8\u0003"+
		"\"\u0011\u0000\u00af\u00b8\u0003$\u0012\u0000\u00b0\u00b8\u0003&\u0013"+
		"\u0000\u00b1\u00b8\u0003*\u0015\u0000\u00b2\u00b8\u00030\u0018\u0000\u00b3"+
		"\u00b8\u00032\u0019\u0000\u00b4\u00b8\u00034\u001a\u0000\u00b5\u00b8\u0003"+
		"6\u001b\u0000\u00b6\u00b8\u00038\u001c\u0000\u00b7\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd\u00be\u0003J%\u0000\u00be"+
		"!\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0012\u0000\u0000\u00c0\u00c1"+
		"\u0003J%\u0000\u00c1#\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0013"+
		"\u0000\u0000\u00c3\u00c8\u0005:\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000"+
		"\u0000\u00c5\u00c6\u0003J%\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0014\u0000\u0000\u00cb\u00cc\u0003:\u001d\u0000\u00cc\u00cd\u0005"+
		"\u0015\u0000\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce\u00cf\u0003"+
		"(\u0014\u0000\u00cf\u00d0\u0005\f\u0000\u0000\u00d0\u00d1\u0005\u0014"+
		"\u0000\u0000\u00d1\'\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0016\u0000"+
		"\u0000\u00d3\u00d7\u0003&\u0013\u0000\u00d4\u00d5\u0005\u0016\u0000\u0000"+
		"\u00d5\u00d7\u0003\u001e\u000f\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7)\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0017\u0000\u0000\u00d9"+
		"\u00db\u0005:\u0000\u0000\u00da\u00dc\u0003,\u0016\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00e1\u0003.\u0017\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\f\u0000\u0000\u00e3\u00e4\u0005\u0017\u0000"+
		"\u0000\u00e4+\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003J%\u0000\u00e6"+
		"\u00e7\u0005\u0002\u0000\u0000\u00e7\u00e8\u0003\u001e\u000f\u0000\u00e8"+
		"-\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0016\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0002\u0000\u0000\u00eb\u00ec\u0003\u001e\u000f\u0000\u00ec/\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005\u0018\u0000\u0000\u00ee\u00ef\u0003"+
		"\u001e\u000f\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f1\u0003"+
		":\u001d\u0000\u00f11\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u001a\u0000"+
		"\u0000\u00f3\u00f4\u0003:\u001d\u0000\u00f4\u00f5\u0005\u0005\u0000\u0000"+
		"\u00f5\u00f6\u0003:\u001d\u0000\u00f6\u00f7\u0005\u0019\u0000\u0000\u00f7"+
		"\u00f8\u0003:\u001d\u0000\u00f8\u00f9\u0005#\u0000\u0000\u00f9\u00fa\u0003"+
		"\u001e\u000f\u0000\u00fa\u00fb\u0005\f\u0000\u0000\u00fb\u00fc\u0005\u001a"+
		"\u0000\u0000\u00fc3\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001b\u0000"+
		"\u0000\u00fe\u00ff\u0003:\u001d\u0000\u00ff\u0100\u0005#\u0000\u0000\u0100"+
		"\u0101\u0003\u001e\u000f\u0000\u0101\u0102\u0005\f\u0000\u0000\u0102\u0103"+
		"\u0005\u001b\u0000\u0000\u01035\u0001\u0000\u0000\u0000\u0104\u0105\u0003"+
		":\u001d\u0000\u0105\u0106\u0005\u0005\u0000\u0000\u0106\u0107\u0003:\u001d"+
		"\u0000\u01077\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001c\u0000\u0000"+
		"\u0109\u010a\u0003:\u001d\u0000\u010a9\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0006\u001d\uffff\uffff\u0000\u010c\u011a\u0003>\u001f\u0000\u010d\u011a"+
		"\u0005:\u0000\u0000\u010e\u0113\u0005:\u0000\u0000\u010f\u0110\u0005\u0003"+
		"\u0000\u0000\u0110\u0111\u0003J%\u0000\u0111\u0112\u0005\u0004\u0000\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u011a\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0117\u0003:\u001d\u0000\u0117"+
		"\u0118\u0005\u0004\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u010b\u0001\u0000\u0000\u0000\u0119\u010d\u0001\u0000\u0000\u0000\u0119"+
		"\u010e\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u011a"+
		"\u012c\u0001\u0000\u0000\u0000\u011b\u011c\n\u0002\u0000\u0000\u011c\u011d"+
		"\u0003<\u001e\u0000\u011d\u011e\u0003:\u001d\u0003\u011e\u012b\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\n\u0001\u0000\u0000\u0120\u0121\u0005\'\u0000"+
		"\u0000\u0121\u012b\u0003:\u001d\u0002\u0122\u0123\n\u0006\u0000\u0000"+
		"\u0123\u0124\u0005\u0006\u0000\u0000\u0124\u0125\u0003J%\u0000\u0125\u0126"+
		"\u0005\u0007\u0000\u0000\u0126\u012b\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\n\u0005\u0000\u0000\u0128\u0129\u0005\b\u0000\u0000\u0129\u012b\u0005"+
		":\u0000\u0000\u012a\u011b\u0001\u0000\u0000\u0000\u012a\u011f\u0001\u0000"+
		"\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d;\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005%\u0000\u0000"+
		"\u0130=\u0001\u0000\u0000\u0000\u0131\u013b\u00053\u0000\u0000\u0132\u013b"+
		"\u00054\u0000\u0000\u0133\u013b\u00056\u0000\u0000\u0134\u013b\u00055"+
		"\u0000\u0000\u0135\u0136\u0005\'\u0000\u0000\u0136\u013b\u00056\u0000"+
		"\u0000\u0137\u0138\u0005\'\u0000\u0000\u0138\u013b\u00055\u0000\u0000"+
		"\u0139\u013b\u00057\u0000\u0000\u013a\u0131\u0001\u0000\u0000\u0000\u013a"+
		"\u0132\u0001\u0000\u0000\u0000\u013a\u0133\u0001\u0000\u0000\u0000\u013a"+
		"\u0134\u0001\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a"+
		"\u0137\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b"+
		"?\u0001\u0000\u0000\u0000\u013c\u0143\u0005\u001d\u0000\u0000\u013d\u0143"+
		"\u0005\u001e\u0000\u0000\u013e\u0143\u0005\u001f\u0000\u0000\u013f\u0143"+
		"\u0005 \u0000\u0000\u0140\u0143\u0003D\"\u0000\u0141\u0143\u0003F#\u0000"+
		"\u0142\u013c\u0001\u0000\u0000\u0000\u0142\u013d\u0001\u0000\u0000\u0000"+
		"\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000"+
		"\u0143A\u0001\u0000\u0000\u0000\u0144\u014b\u0005\u001d\u0000\u0000\u0145"+
		"\u014b\u0005\u001e\u0000\u0000\u0146\u014b\u0005\u001f\u0000\u0000\u0147"+
		"\u014b\u0005 \u0000\u0000\u0148\u014b\u0003D\"\u0000\u0149\u014b\u0003"+
		"H$\u0000\u014a\u0144\u0001\u0000\u0000\u0000\u014a\u0145\u0001\u0000\u0000"+
		"\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014bC\u0001\u0000\u0000\u0000\u014c\u014d\u0005!\u0000\u0000\u014d"+
		"\u014e\u0005\u0006\u0000\u0000\u014e\u014f\u00055\u0000\u0000\u014f\u0150"+
		"\u0005\u0007\u0000\u0000\u0150E\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"\"\u0000\u0000\u0152\u0153\u0005\u0006\u0000\u0000\u0153\u0154\u00055"+
		"\u0000\u0000\u0154\u0155\u0005\u0007\u0000\u0000\u0155\u0156\u0005$\u0000"+
		"\u0000\u0156\u0157\u0003@ \u0000\u0157G\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\"\u0000\u0000\u0159\u015a\u0005\u0006\u0000\u0000\u015a\u015b"+
		"\u00055\u0000\u0000\u015b\u015c\u0005\u0007\u0000\u0000\u015c\u015d\u0005"+
		"$\u0000\u0000\u015d\u015e\u0003B!\u0000\u015eI\u0001\u0000\u0000\u0000"+
		"\u015f\u0164\u0003:\u001d\u0000\u0160\u0161\u0005\u0001\u0000\u0000\u0161"+
		"\u0163\u0003:\u001d\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165K\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0018Y_emu}\u007f\u008f\u0094\u009a\u00b7\u00b9\u00c8"+
		"\u00d6\u00dd\u00e0\u0113\u0119\u012a\u012c\u013a\u0142\u014a\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}