package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends Type {
	public String name;
	public List<String> arguments;
	public List<MCLangParser.StatementContext> body;
	
	public FunctionType(String name, List<String> arguments, MCLangParser.BodyContext body) {
		this.name = name;
		this.body = new ArrayList<>();
		this.arguments = arguments;

		this.body.addAll(body.statement());
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
