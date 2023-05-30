package com.revolvingmadness.mclang;

public class Main {
    public static void main(String[] args) {
        MCLangInterpreter interpreter = new MCLangInterpreter();
        interpreter.run("""
                a = 0;
                if (a) {
                    msg = "A is true";
                } else {
                    msg = "A is false";
                }
                """);
        System.out.println(interpreter.variables);
    }
}