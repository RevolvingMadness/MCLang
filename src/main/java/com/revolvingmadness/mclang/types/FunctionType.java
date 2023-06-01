package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionType extends Type {
	public String name;
	public List<String> arguments;
	public List<MCLangParser.StatementContext> body;
	public MCLangParser.BodyContext bodyContext;
	public Map<String, Type> variables;
	
	public FunctionType(String name, List<String> arguments, MCLangParser.BodyContext body) {
		this.name = name;
		this.body = new ArrayList<>();
		this.bodyContext = body;
		this.arguments = arguments;
		this.variables = new HashMap<>();

		this.body.addAll(body.statement());
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
