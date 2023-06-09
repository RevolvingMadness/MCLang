grammar MCLang;

program: statement*;

statement
    : variableAssignment ';'
    | functionCall ';'
    | ifStatement ';'?
    | whileStatement ';'?
    | functionDeclarationStatement ';'?
    | classDeclarationStatement ';'?
    | classConstructorStatement ';'?
    | propertyClassMemberAccess ';'
    | returnStatement ';'
    | importStatement ';'
    | importFromStatement ';'
    | statement '//' .*?
    | '//' .*?
    ;

expr
    // Literals
    : NULL #nullExpression
    | STRING #stringExpression
    | BOOLEAN #booleanExpression
    | NUMBER #numberExpression
    | propertyClassMemberAccess #identifierExpression

    // Arithmetic Expressions
    | '(' expr ')' #parenthesisExpression
    | propertyClassMemberAccess ':=' expr #walrusOperatorExpression
    | expr '?' expr ':' expr #ternaryOperatorExpression
    | '-' expr #unaryOperatorExpression
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
    | list #listExpression
    | dict #dictExpression
    | functionCall #functionCallExpression
    | classInit #classInitExpression
    | variableFunctionDeclaration #functionDeclarationExpression
    ;

variableAssignment
    : IDENTIFIER? propertyClassMemberAccess '=' expr #regularVariableAssignment

    // Arithmetic Assignments
    | propertyClassMemberAccess '**=' expr #exponentiationVariableAssignment
    | propertyClassMemberAccess '*=' expr #multiplyVariableAssignment
    | propertyClassMemberAccess '/=' expr #divideVariableAssignment
    | propertyClassMemberAccess '//=' expr #floorDivideVariableAssignment
    | propertyClassMemberAccess '%=' expr #moduloVariableAssignment
    | propertyClassMemberAccess '+=' expr #addVariableAssignment
    | propertyClassMemberAccess '++' #incrementVariableAssignment
    | propertyClassMemberAccess '-=' expr #subtractVariableAssignment
    | propertyClassMemberAccess '--' #decrementVariableAssignment

    // Bitwise Assignments
    | propertyClassMemberAccess '&=' expr #bitwiseAndVariableAssignment
    | propertyClassMemberAccess '^=' expr #bitwiseXorVariableAssignment
    | propertyClassMemberAccess '|=' expr #bitwiseOrVariableAssignment
    ;

ifStatement: 'if' '(' expr ')' body ('else' body)?;

whileStatement: 'while' '(' expr ')' body;

functionDeclarationStatement: 'function ' IDENTIFIER '(' identifierArgument* ')' ('->' IDENTIFIER)? (body | '=>' expr ';');

variableFunctionDeclaration: '(' identifierArgument* ')' ('->' IDENTIFIER)? (body | '=>' expr);

classDeclarationStatement: 'class ' IDENTIFIER body;

classConstructorStatement: IDENTIFIER '(' identifierArgument* ')' body;

classInit: 'new ' IDENTIFIER '(' exprArgument* ')';

propertyClassMemberAccess
    : IDENTIFIER
    | IDENTIFIER '.' propertyClassMemberAccess
    ;

identifierArgument: IDENTIFIER? IDENTIFIER ','?;

functionCall: propertyClassMemberAccess '(' exprArgument* ')';

returnStatement: 'return ' expr;

importStatement
    : 'import' STRING 'as ' IDENTIFIER #regularImportStatement
    | 'import ' 'builtin' STRING 'as ' IDENTIFIER #builtinImportStatement
    ;

importFromStatement
    : 'import ' ((IDENTIFIER ','?)*|'*') ' from' STRING #regularImportFromStatement
    | 'import ' ((IDENTIFIER ','?)*|'*') ' from ' 'builtin' STRING #builtinImportFromStatement
    ;

exprArgument: expr ','?;

body: '{' statement* '}';

list: '[' (expr ','?)* ']';

dict: '{' (STRING ':' expr ','?)* '}';

// Literals
NUMBER: INT | FLOAT;
NULL: 'null';
BOOLEAN: 'true' | 'false';
FLOAT: INT '.' INT;
INT: [0-9]+;
STRING: '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace
WS: [ \r\t\n] -> skip;