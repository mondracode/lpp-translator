grammar lpp;

s: dec_registros dec_variables dec_funciones prog;

dec_registros: (REGISTRO ID dec_variables FIN REGISTRO)*;

dec_variables: dec_variable*;

dec_variable: tipo ID (TKN_COMMA ID)*;

dec_funciones: (dec_funcion | dec_procedimiento)*;

dec_funcion: FUNCION ID parametros TKN_COLON tipo dec_variables prog;

parametros: (TKN_OPENING_PAR dec_var (TKN_COMMA dec_var)* TKN_CLOSING_PAR)?;

dec_var: (VAR)? tipo ID;

dec_procedimiento: PROCEDIMIENTO ID parametros dec_variables prog;

prog: INICIO cmds FIN;

cmds: (escriba | lea | llamar | si | caso | repita | para | mientras | asigne | retorne)*;

escriba: ESCRIBA exp_list;

lea: LEA exp_list;

llamar: LLAMAR ID ( TKN_OPENING_PAR exp_list TKN_CLOSING_PAR )?;

si: SI exp ENTONCES cmds sino FIN SI;

sino: (SINO si | SINO cmds)?;

caso: CASO ID (opcion)+ (caso_sino)? FIN CASO;

opcion: exp_list TKN_COLON cmds;

caso_sino: SINO TKN_COLON cmds;

repita: REPITA cmds HASTA exp;

para: PARA exp TKN_ASSIGN exp HASTA exp HAGA cmds FIN PARA;

mientras: MIENTRAS exp HAGA cmds FIN MIENTRAS;

asigne: exp TKN_ASSIGN exp;

retorne: RETORNE exp;

exp: literal | ID | exp TKN_OPENING_BRA exp_list TKN_CLOSING_BRA | exp TKN_PERIOD ID | ID (TKN_OPENING_PAR exp_list TKN_CLOSING_PAR)? | TKN_OPENING_PAR exp TKN_CLOSING_PAR | exp OPERATOR exp;

literal: CHAR_LITERAL | CADENA_LITERAL | REAL_LITERAL | ENTERO_LITERAL | BOOLEANO_LITERAL | NEGATIVO_ENTERO | NEGATIVO_REAL;

tipo: ENTERO | REAL | BOOLEANO | CARACTER | cadena | arreglo;

cadena: CADENA TKN_OPENING_BRA exp TKN_CLOSING_BRA;

arreglo: ARREGLO TKN_OPENING_BRA ENTERO_LITERAL TKN_CLOSING_BRA DE tipo;

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
OPERATOR: TKN_PLUS | TKN_MINUS | TKN_TIMES | TKN_DIV | TKN_POWER | TKN_EQUAL | TKN_NEQ | TKN_LESS | TKN_LEQ | TKN_GREATER | TKN_GEQ | TKN_DIV_INT | TKN_MOD;

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
TKN_DIV_INT: D I V;
TKN_MOD: M O D;


// literals
fragment LETRAS_CADENA: ~["];
fragment LETRAS_CHAR: ~['];


CHAR_LITERAL: TKN_SINGLE_QUOTE LETRAS_CHAR? TKN_SINGLE_QUOTE;

CADENA_LITERAL: TKN_DOUBLE_QUOTE LETRAS_CADENA* TKN_DOUBLE_QUOTE;

fragment DIGITOS: [0-9];

ENTERO_LITERAL: DIGITOS+;

REAL_LITERAL: DIGITOS+ ('.' DIGITOS+)?;

NEGATIVO_ENTERO: '-' DIGITOS+;

NEGATIVO_REAL: '-' DIGITOS+ ('.' DIGITOS+)?;

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