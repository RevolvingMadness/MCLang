package com.revolvingmadness.mclang;

import com.revolvingmadness.mclang.types.Type;
import generated.MCLangLexer;
import generated.MCLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class MCLangInterpreter {
    public Map<String, Type> variables;
    private static final MCLangVisitor visitor = new MCLangVisitor();

    public void runCode(String code) {
        this.variables = new HashMap<>();
        CharStream inputStream = CharStreams.fromString(code);
        MCLangLexer lexer = new MCLangLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        MCLangParser parser = new MCLangParser(commonTokenStream);

        MCLangParser.ProgramContext programContext = parser.program();

        visitor.visit(programContext);

        this.variables = visitor.variables;
    }

    public static void throwBinOpException(String type, Object left, Object right) {
        throw new RuntimeException("Cannot apply operator '" + type + "' to types '" + left.getClass().getSimpleName() + "' and '" + right.getClass().getSimpleName() + "'");
    }

    public static void throwBinOpException(String type, Object input) {
        throw new RuntimeException("Cannot apply operator '" + type + "' to type '" + input.getClass().getSimpleName() + "'");
    }
    
    public void runFile(String name) {
        StringBuilder content = new StringBuilder();
        try {
            Files.readAllLines(Path.of(name)).forEach(content::append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        runCode(content.toString());
    }
}
