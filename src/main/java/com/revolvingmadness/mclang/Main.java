package com.revolvingmadness.mclang;

public class Main {
	public static void main(String[] args) {
		MCLangInterpreter interpreter = new MCLangInterpreter();
		interpreter.run("""
				function foobar() {
					function bar() {
						return "bar";
					}
					return "foo" + bar();
				}
				foobar = foobar();
				""");
		
		System.out.println(interpreter.variables);
	}
}