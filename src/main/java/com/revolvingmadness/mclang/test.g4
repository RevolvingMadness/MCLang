grammar test;

// Lexer rules
IDENTIFIER  : [a-zA-Z][a-zA-Z0-9]*;
WHITESPACE  : [ \t\r\n]+ -> skip;

// Parser rules
parse       : statement+ EOF;
statement   : classDeclarationStatement | classMemberAccess;

classDeclarationStatement
            : 'class ' IDENTIFIER classBody;

classMemberAccess
            : IDENTIFIER ('.' IDENTIFIER)+;

classBody   : '{' classMember+ '}';

classMember : IDENTIFIER ';';

