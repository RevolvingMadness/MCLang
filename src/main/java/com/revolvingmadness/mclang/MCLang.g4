grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    | ifStatement ';'?
    ;

expr
    : NUMBER #numberExpression
    | STRING #stringExpression
    | BOOLEAN #booleanExpression
    | IDENTIFIER #identifierExpression
    | '(' expr ')' #parenthesisExpression
    | expr '^' expr #powerExpression
    | expr '*' expr #multiplyExpression
    | expr '/' expr #divideExpression
    | expr '//' expr #floorDivideExpression
    | expr '+' expr #addExpression
    | expr '-' expr #subtractExpression
    ;

variableAssignment
    : IDENTIFIER '=' expr
    ;

ifStatement: 'if (' expr ')' body ('else ' body)?;

body: '{' statement* '}';

STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
NUMBER: '-'? INT | FLOAT;
INT: [0-9]+;
FLOAT: INT '.' INT;
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z0-9_]+;
WS: [ \r\t\n] -> skip;