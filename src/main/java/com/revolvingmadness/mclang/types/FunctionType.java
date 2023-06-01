package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionType extends Type {
	public String name;
	public List<String> arguments;
	public List<MCLangParser.StatementContext> body;
	public Type returnValue;
	
	
	public FunctionType(String name, List<String> arguments, MCLangParser.BodyContext body) {
		this.name = name;
		this.body = new ArrayList<>();
		this.arguments = arguments;
		
		this.body.addAll(body.statement());
		this.returnValue = new NullType();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof FunctionType type))
			return false;
		return Objects.equals(name, type.name) && Objects.equals(arguments, type.arguments) && Objects.equals(body, type.body) && Objects.equals(returnValue, type.returnValue);
	}
}
