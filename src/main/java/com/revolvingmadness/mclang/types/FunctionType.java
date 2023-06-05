package com.revolvingmadness.mclang.types;

import generated.MCLangParser;

import java.lang.reflect.Method;
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
	public Method runnableBody;
	
	
	public FunctionType(String name, Map<String, Class<? extends Type>> arguments, Class<? extends Type> returnType, ClassType clazz, MCLangParser.BodyContext body) {
		super();
		this.name = name;
		this.arguments = arguments;
		this.returnType = returnType;
		this.clazz = clazz;
		
		this.body = new ArrayList<>();
		this.body.addAll(body.statement());
	}
	
	public FunctionType(String name, Map<String, Class<? extends Type>> arguments, Class<? extends Type> returnType, ClassType clazz, MCLangParser.ExprContext shorthandBody) {
		this.name = name;
		this.arguments = arguments;
		this.returnType = returnType;
		this.clazz = clazz;
		
		this.shorthandBody = shorthandBody;
	}
	
	public FunctionType(String name, List<Class<? extends Type>> arguments, Class<? extends Type> returnType, Class<?> clazz) {
		this.name = name;
		this.returnType = returnType;
		try {
			this.runnableBody = clazz.getDeclaredMethod(name, arguments.toArray(new Class[0]));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	@Override
	public String toString() {
		return this.name;
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
