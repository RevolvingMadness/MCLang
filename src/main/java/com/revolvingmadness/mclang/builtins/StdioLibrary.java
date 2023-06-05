package com.revolvingmadness.mclang.builtins;

import com.revolvingmadness.mclang.types.NullType;
import com.revolvingmadness.mclang.types.StringType;
import com.revolvingmadness.mclang.types.Type;

import java.util.Scanner;

public class StdioLibrary extends Library {
	public StdioLibrary() {
		super("stdio");
	}
	
	public static Type print(StringType contents) {
		System.out.println(contents.toString());
		return new NullType();
	}
	
	public static Type input(StringType prompt) {
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		return new StringType(scanner.nextLine());
	}
}
