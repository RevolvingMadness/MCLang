package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionType extends Type {
	public String name;
	public List<String> arguments;
	public List<MCLangParser.StatementContext> body;
	
	public MCLangParser.ExprContext shorthandBody;
	public Type returnValue;
	public Class<? extends Type> returnType;
	
	
	public FunctionType(String name, List<String> arguments, Class<? extends Type> returnType, MCLangParser.BodyContext body) {
		this.name = name;
		this.body = new ArrayList<>();
		this.arguments = arguments;
		this.returnType = returnType;
		
		this.body.addAll(body.statement());
		this.returnValue = new NullType();
	}
	
	public FunctionType(String name, List<String> arguments, Class<? extends Type> returnType, MCLangParser.ExprContext shorthandBody) {
		this.name = name;
		this.arguments = arguments;
		this.returnType = returnType;
		this.shorthandBody = shorthandBody;
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
