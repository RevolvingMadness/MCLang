grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    ;

expr
    : NUMBER #numberExpression
    | BOOLEAN #booleanExpression
    | IDENTIFIER #identifierExpression
    | '(' expr ')' #parenthesisExpression
    | expr '^' expr #powerExpression
    | expr '*' expr #multiplyExpression
    | expr '/' expr #divideExpression
    | expr '+' expr #addExpression
    | expr '-' expr #subtractExpression
    ;

variableAssignment
    : IDENTIFIER '=' expr
    ;

NUMBER: INT | FLOAT;
INT: [0-9]+;
FLOAT: INT '.' INT;
BOOLEAN: 'true' | 'false';
IDENTIFIER: [A-Za-z_]+;
WS: [ \r\t\n] -> skip;