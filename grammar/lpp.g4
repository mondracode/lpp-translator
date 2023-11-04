grammar lpp;

s: dec_registros dec_variables dec_funciones prog_main;

dec_registros: (REGISTRO ID dec_variables_int FIN REGISTRO)*;

dec_variables: dec_variable*;

dec_variables_int: dec_variable_int*;

dec_variable_int: tipo_variable ID dec_sig_variable*;

dec_variable: tipo_variable ID dec_sig_variable*;

dec_sig_variable: TKN_COMMA ID;

dec_funciones: (dec_funcion | dec_procedimiento)*;

dec_funcion: FUNCION ID parametros TKN_COLON tipo dec_variables prog;

parametros: (TKN_OPENING_PAR dec_var parametro_sig* TKN_CLOSING_PAR)?;

parametro_sig: TKN_COMMA dec_var;

dec_var: (VAR)? tipo ID;

dec_procedimiento: PROCEDIMIENTO ID parametros_proc dec_variables prog_proc;

parametros_proc: (TKN_OPENING_PAR dec_var parametro_sig_proc* TKN_CLOSING_PAR)?;

parametro_sig_proc: TKN_COMMA dec_var;

prog_proc: INICIO cmds FIN;

prog: INICIO cmds FIN;

prog_main: INICIO cmds FIN;

cmds: (escriba | lea | llamar | si | caso | repita | para | mientras | asigne | retorne)*;

escriba: ESCRIBA exp_list;

lea: LEA exp_lea;

exp_lea: exp (TKN_COMMA exp)*;

llamar: LLAMAR ID ( TKN_OPENING_PAR exp_list TKN_CLOSING_PAR )?;

si: SI exp si_aux sino? FIN SI;

si_aux: ENTONCES cmds;

sino: SINO si | SINO cmds;

caso: CASO ID (opcion)+ (caso_sino)? FIN CASO;

opcion: opcion_exp TKN_COLON cmds;

opcion_exp: exp_list;

caso_sino: SINO TKN_COLON cmds;

repita: REPITA cmds HASTA exp;

para: PARA exp TKN_ASSIGN exp HASTA exp HAGA cmds FIN PARA;

mientras: MIENTRAS exp HAGA cmds FIN MIENTRAS;

asigne: exp TKN_ASSIGN exp;

retorne: RETORNE exp;

exp: literal | ID | exp TKN_OPENING_BRA exp_list TKN_CLOSING_BRA | exp TKN_PERIOD ID | ID (TKN_OPENING_PAR exp_list TKN_CLOSING_PAR)? | TKN_OPENING_PAR exp TKN_CLOSING_PAR | exp operator exp | exp TKN_MINUS exp | exp op_o exp | exp op_y exp| exp op_div exp| exp op_mod exp;

op_o: TKN_OR;

op_y: TKN_AND;

op_div: TKN_DIV_INT;

op_mod: TKN_MOD;

operator: OPERATOR;

literal: CHAR_LITERAL | CADENA_LITERAL | REAL_LITERAL | ENTERO_LITERAL | TKN_MINUS REAL_LITERAL | TKN_MINUS ENTERO_LITERAL | BOOLEANO_LITERAL;

tipo: ENTERO | REAL | BOOLEANO | CARACTER | cadena | arreglo;

tipo_variable: ENTERO | REAL | BOOLEANO | CARACTER | cadena | arreglo_variable;

cadena: CADENA TKN_OPENING_BRA ENTERO_LITERAL TKN_CLOSING_BRA;

arreglo: ARREGLO TKN_OPENING_BRA ENTERO_LITERAL TKN_CLOSING_BRA DE tipo;

arreglo_variable: ARREGLO TKN_OPENING_BRA ENTERO_LITERAL TKN_CLOSING_BRA DE tipo_variable;

exp_list: exp (TKN_COMMA exp)*;

// Tokens
TKN_COMMA: ',';
TKN_COLON: ':';
TKN_OPENING_PAR: '(';
TKN_CLOSING_PAR: ')';
TKN_ASSIGN: '<-';
TKN_OPENING_BRA: '[';
TKN_CLOSING_BRA: ']';
TKN_PERIOD: '.';
TKN_SINGLE_QUOTE: '\'';
TKN_DOUBLE_QUOTE: '"';

// Reserved words that we gotta declare like this for them to be case-insensitive
REGISTRO: R E G I S T R O;
FIN: F I N;
FUNCION: F U N C I O N;
VAR: V A R;
PROCEDIMIENTO: P R O C E D I M I E N T O;
INICIO: I N I C I O;
ESCRIBA: E S C R I B A;
LEA: L E A;
LLAMAR: L L A M A R;
SI: S I;
ENTONCES: E N T O N C E S;
SINO: S I N O;
CASO: C A S O;
REPITA: R E P I T A;
HASTA: H A S T A;
PARA: P A R A;
MIENTRAS: M I E N T R A S;
RETORNE: R E T O R N E;
ENTERO: E N T E R O;
REAL: R E A L;
BOOLEANO: B O O L E A N O;
CARACTER: C A R A C T E R;
CADENA: C A D E N A;
ARREGLO: A R R E G L O;
HAGA: H A G A;
DE: D E;

// operators
OPERATOR: TKN_PLUS | TKN_TIMES | TKN_DIV | TKN_POWER | TKN_EQUAL | TKN_NEQ | TKN_LESS | TKN_LEQ | TKN_GREATER | TKN_GEQ;

TKN_PLUS: '+';
TKN_MINUS: '-';
TKN_TIMES: '*';
TKN_DIV: '/';
TKN_POWER: '^';
TKN_EQUAL: '=';
TKN_NEQ: '<>';
TKN_LESS: '<';
TKN_LEQ: '<=';
TKN_GREATER: '>';
TKN_GEQ: '>=';
TKN_DIV_INT: ' ' D I V ' ';
TKN_MOD: ' ' M O D ' ';
TKN_AND: ' ' Y ' ';
TKN_OR: ' ' O ' ';


// literals
fragment LETRAS_CADENA: ~["];
fragment LETRAS_CHAR: ~['];


CHAR_LITERAL: TKN_SINGLE_QUOTE LETRAS_CHAR? TKN_SINGLE_QUOTE;

CADENA_LITERAL: TKN_DOUBLE_QUOTE LETRAS_CADENA* TKN_DOUBLE_QUOTE;

fragment DIGITOS: [0-9];

ENTERO_LITERAL: DIGITOS+;

REAL_LITERAL: DIGITOS+ ('.' DIGITOS+)?;

BOOLEANO_LITERAL: ( VERDADERO | FALSO );

VERDADERO: V E R D A D E R O;

FALSO: F A L S O;

// for case insesnsitivity
fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

ID: [a-zA-Z_]+[a-zA-Z_0-9]*;

// skipped rules
SHORT_COMMENT: '//' ~[\r\n]* -> skip;
LONG_COMMENT: '/*' .*? '*/' -> skip;
TABS: [\t ]+ -> skip;
NUEVA_LINEA: [\r\n]+ -> skip;