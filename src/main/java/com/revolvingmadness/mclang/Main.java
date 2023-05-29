package com.revolvingmadness.mclang;

import generated.MCLangLexer;
import generated.MCLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString("x = 2 ^ 5.1;");
        MCLangLexer lexer = new MCLangLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        MCLangParser parser = new MCLangParser(commonTokenStream);
        MCLangParser.ProgramContext programContext = parser.program();
        MCLangVisitor visitor = new MCLangVisitor();
        visitor.visit(programContext);
        System.out.println(visitor.variables);
    }
}