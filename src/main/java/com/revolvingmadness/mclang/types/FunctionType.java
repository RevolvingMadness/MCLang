package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FunctionType extends Type {
	public String name;
	public Map<String, Class<? extends Type>> arguments;
	public List<MCLangParser.StatementContext> body;
	
	public MCLangParser.ExprContext shorthandBody;
	public Type returnValue;
	public Class<? extends Type> returnType;
	public ClassType clazz;
	
	
	public FunctionType(String name, Map<String, Class<? extends Type>> arguments, Class<? extends Type> returnType, ClassType clazz, MCLangParser.BodyContext body) {
		super();
		this.name = name;
		this.body = new ArrayList<>();
		this.arguments = arguments;
		this.returnType = returnType;
		this.clazz = clazz;
		
		this.body.addAll(body.statement());
	}
	
	public FunctionType(String name, Map<String, Class<? extends Type>> arguments, Class<? extends Type> returnType, ClassType clazz, MCLangParser.ExprContext shorthandBody) {
		this.name = name;
		this.arguments = arguments;
		this.returnType = returnType;
		this.clazz = clazz;
		this.shorthandBody = shorthandBody;
	}
	
	@Override
	public String toString() {
		return this.name + ": " + arguments.size() + " argument(s)";
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof FunctionType functionType))
			return false;
		return Objects.equals(name, functionType.name) && Objects.equals(arguments, functionType.arguments) && Objects.equals(body, functionType.body) && Objects.equals(returnValue, functionType.returnValue);
	}
}
