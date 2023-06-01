package com.revolvingmadness.mclang;

public class Main {
	public static void main(String[] args) {
		MCLangInterpreter interpreter = new MCLangInterpreter();
		interpreter.runFile("main.mclang");
		System.out.println(interpreter.variables);
	}
}