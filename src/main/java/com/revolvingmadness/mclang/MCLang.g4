grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    | functionCall ';'
    | ifStatement ';'?
    | whileStatement ';'?
    | functionDeclarationStatement ';'?
    | returnStatement ';'
    | importStatement ';'
    ;

expr
    // Literals
    : NUMBER #numberExpression
    | NULL #nullExpression
    | STRING #stringExpression
    | BOOLEAN #booleanExpression
    | IDENTIFIER #identifierExpression

    // Arithmetic Expressions
    | '(' expr ')' #parenthesisExpression
    | expr '**' expr #exponentiationExpression
    | expr '*' expr #multiplyExpression
    | expr '/' expr #divideExpression
    | expr '//' expr #floorDivideExpression
    | expr '%' expr #moduloExpression
    | expr '+' expr #addExpression
    | expr '-' expr #subtractExpression

    // Comparison Expressions
    | expr '<' expr #lessThanExpression
    | expr '<=' expr #lessThanOrEqualToExpression
    | expr '>' expr #greaterThanExpression
    | expr '>=' expr #greaterThanOrEqualToExpression
    | expr '!=' expr #notEqualToExpression
    | expr '==' expr #equalToExpression

    // Bitwise Expressions
    | expr '&' expr #bitwiseAndExpression
    | expr '^' expr #bitwiseXorExpression
    | expr '|' expr #bitwiseOrExpression

    // Boolean Expressions
    | expr '&&' expr #booleanAndExpression
    | expr '||' expr #booleanOrExpression
    | '!' expr #booleanNotExpression

    // Other
    | IDENTIFIER ':=' expr #assignmentExpression
    | list #listExpression
    | dict #dictExpression
    | functionCall #functionCallExpression
    ;

variableAssignment
    : IDENTIFIER '=' expr #regularVariableAssignment

    // Arithmetic Assignments
    | IDENTIFIER '**=' expr #exponentiationVariableAssignment
    | IDENTIFIER '*=' expr #multiplyVariableAssignment
    | IDENTIFIER '/=' expr #divideVariableAssignment
    | IDENTIFIER '//=' expr #floorDivideVariableAssignment
    | IDENTIFIER '%=' expr #moduloVariableAssignment
    | IDENTIFIER '+=' expr #addVariableAssignment
    | IDENTIFIER '-=' expr #subtractVariableAssignment

    // Bitwise Assignments
    | IDENTIFIER '&=' expr #bitwiseAndVariableAssignment
    | IDENTIFIER '^=' expr #bitwiseXorVariableAssignment
    | IDENTIFIER '|=' expr #bitwiseOrVariableAssignment
    ;

ifStatement: 'if' '(' expr ')' body ('else' body)?;

whileStatement: 'while' '(' expr ')' body;

functionDeclarationStatement: 'function ' IDENTIFIER '(' (IDENTIFIER ','?)* ')' body;

functionCall: IDENTIFIER '(' argument* ')';

returnStatement: 'return ' expr;

importStatement: 'import ' STRING;

argument: expr ','?;

body: '{' statement* '}';

list: '[' (expr ','?)* ']';

dict: '{' (STRING ':' expr ','?)* '}';

// Literals
BOOLEAN: 'true' | 'false';
NULL: 'null';
NUMBER: '-'? INT | FLOAT;
FLOAT: INT '.' INT;
INT: [0-9]+;
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace
WS: [ \r\t\n] -> skip;