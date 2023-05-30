package com.revolvingmadness.mclang;

public class Main {
    public static void main(String[] args) {
        MCLangInterpreter interpreter = new MCLangInterpreter();
        interpreter.run("""
                result = 0;
                i = 0;
                j = 0;
                while (i < 5) {
                    while (j < 5) {
                        result = result + 1;
                        j = j + 1;
                    }
                    j = 0;
                    i = i + 1;
                }
                """);
        System.out.println(interpreter.variables);
    }
}