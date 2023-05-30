package com.revolvingmadness.mclang;

public class Main {
    public static void main(String[] args) {
        MCLangInterpreter interpreter = new MCLangInterpreter();
        interpreter.run("""
                a = 1 | 0;
                """);
        System.out.println(interpreter.variables);
    }
}