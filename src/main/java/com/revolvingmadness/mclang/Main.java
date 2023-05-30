package com.revolvingmadness.mclang;

public class Main {
    public static void main(String[] args) {
        MCLangInterpreter interpreter = new MCLangInterpreter();
        interpreter.run("""
                x = 0;
                while (x < 5000) {
                    x += 1 + x;
                }
                """);
        System.out.println(interpreter.variables);
    }
}