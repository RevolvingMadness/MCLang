package com.revolvingmadness.mclang;

public class Main {
    public static void main(String[] args) {
        MCLangInterpreter interpreter = new MCLangInterpreter();
        interpreter.run("""
                x = {
                    "a": 1,
                    "b": 2
                };
                """);
        System.out.println(interpreter.variables);
    }
}