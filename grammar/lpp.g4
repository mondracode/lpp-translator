grammar lpp;

s: dec_registros dec_variables dec_funciones prog;

dec_registros: REGISTRO ID dec_variables FIN REGISTRO;

dec_variables: dec_variable*;

dec_variable: tipo ID (',' ID)*;

dec_funciones: (dec_funcion | dec_procedimiento)*;

dec_funcion: FUNCION ID parametros ':' tipo dec_variables prog;

parametros: ('(' dec_var (',' dec_var)* ')')?;

dec_var: (VAR)? tipo ID;

dec_procedimiento: PROCEDIMIENTO ID parametros dec_variables prog;

prog: INICIO cmds FIN;

cmds: (escriba | lea | llamar | si | caso | repita | para | mientras | asigne | retorne)*;

escriba: ESCRIBA exp_list;

lea: LEA exp_list;

llamar: LLAMAR ID ( '(' exp_list ')' )?;

si: SI exp ENTONCES cmds sino FIN SI;

sino: (SINO si | SINO cmds)?;

caso: CASO ID (opcion)+ (caso_sino)? FIN CASO;

opcion: exp_list ':' cmds;

caso_sino: SINO ':' cmds;

repita: REPITA cmds HASTA exp;

para: para EXP '<-' EXP HASTA EXP HAGA cmds FIN PARA;

mientras: MIENTRAS exp HAGA cmds FIN MIENTRAS;

asigne: EXP '<-' EXP;

exp: literal | ID | exp '[' exp_list ']' | exp '.' ID | ID ('(' exp_list ')')? | '(' exp ')' | exp OPERATOR exp;

literal: char | cadena | real | entero | booleano;

tipo: ENTERO | REAL | BOOLEANO | CARACTER | CADENA | arreglo;

arreglo: ARREGLO '[' entero ']' DE tipo;

exp_list: exp (',' exp)*;


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