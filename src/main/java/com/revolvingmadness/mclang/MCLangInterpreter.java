package com.revolvingmadness.mclang;

import generated.MCLangLexer;
import generated.MCLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.Map;

public class MCLangInterpreter {
    public Map<String, Object> variables;

    public void run(String code) {
        this.variables = new HashMap<>();
        CharStream inputStream = CharStreams.fromString(code);
        MCLangLexer lexer = new MCLangLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        MCLangParser parser = new MCLangParser(commonTokenStream);
        MCLangParser.ProgramContext programContext = parser.program();
        MCLangVisitor visitor = new MCLangVisitor();
        visitor.visit(programContext);
        this.variables = visitor.variables;
    }
}
