grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    | functionCall ';'
    | ifStatement ';'?
    | whileStatement ';'?
    | functionDeclarationStatement
    | returnStatement ';'
    | importStatement ';'
    | statement '//' .*?
    | '//' .*?
    ;

expr
    // Literals
    : NULL #nullExpression
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

    // Operators
    | IDENTIFIER ':=' expr #walrusOperatorExpression
    | expr '?' expr ':' expr #ternaryOperatorExpression
    | '-' expr #unaryOperatorExpression

    // Other
    | list #listExpression
    | dict #dictExpression
    | functionCall #functionCallExpression
    | number #numberExpression
    ;

variableAssignment
    : IDENTIFIER? IDENTIFIER '=' expr #regularVariableAssignment

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

functionDeclarationStatement: 'function ' IDENTIFIER '(' identifierArgument* ')' ('->' IDENTIFIER)? (body ';'? | '=>' expr ';');

identifierArgument: IDENTIFIER? IDENTIFIER ','?;

functionCall: IDENTIFIER '(' exprArgument* ')';

returnStatement: 'return ' expr;

importStatement: 'import ' STRING;

exprArgument: expr ','?;

body: '{' statement* '}';

list: '[' (expr ','?)* ']';

dict: '{' (STRING ':' expr ','?)* '}';

number: '-'? (INT | FLOAT);

// Literals
NULL: 'null';
BOOLEAN: 'true' | 'false';
FLOAT: INT '.' INT;
INT: [0-9]+;
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace
WS: [ \r\t\n] -> skip;