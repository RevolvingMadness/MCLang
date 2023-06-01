package com.revolvingmadness.mclang;

public class Main {
	public static void main(String[] args) {
		MCLangInterpreter interpreter = new MCLangInterpreter();
		interpreter.run("""
				function foobar(x) {
					return x;
				}
				foobar = foobar(1);
				""");
		System.out.println(interpreter.variables);
	}
}