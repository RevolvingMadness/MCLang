grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    | ifStatement ';'?
    | whileStatement ';'?
    ;

expr
    // Literals
    : NUMBER #numberExpression
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

    // Assignment Expression
    | IDENTIFIER ':=' expr #assignmentExpression
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

body: '{' statement* '}';

// Literals
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
NUMBER: '-'? INT | FLOAT;
INT: [0-9]+;
FLOAT: INT '.' INT;
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z0-9_]+;

// Whitespace
WS: [ \r\t\n] -> skip;