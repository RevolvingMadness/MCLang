package com.revolvingmadness.mclang;

import com.revolvingmadness.mclang.types.FunctionType;

public class Main {
	public static void main(String[] args) {
		MCLangInterpreter interpreter = new MCLangInterpreter();
		interpreter.run("""
				function foo(x) {
				    newX = x;
				}
				foo(1);
				""");
		
		System.out.println(interpreter.variables);
		System.out.println(((FunctionType) interpreter.variables.get("foo")).variables);
	}
}