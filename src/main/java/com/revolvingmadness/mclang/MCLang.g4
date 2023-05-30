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
    | expr '**' expr #exponentiationExpression
    | expr '*' expr #multiplyExpression
    | expr '/' expr #divideExpression
    | expr '//' expr #floorDivideExpression
    | expr '%' expr #moduloExpression
    | expr '+' expr #addExpression
    | expr '-' expr #subtractExpression
    | expr '<' expr #lessThanExpression
    | expr '<=' expr #lessThanOrEqualToExpression
    | expr '>' expr #greaterThanExpression
    | expr '>=' expr #greaterThanOrEqualToExpression
    | expr '!=' expr #notEqualToExpression
    | expr '==' expr #equalToExpression
    | expr '&' expr #bitwiseAndExpression
    | expr '&&' expr #booleanAndExpression
    | expr '^' expr #bitwiseXorExpression
    | expr '|' expr #bitwiseOrExpression
    | expr '||' expr #booleanOrExpression
    | '!' expr #booleanNotExpression
    | IDENTIFIER ':=' expr #assignmentExpression
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