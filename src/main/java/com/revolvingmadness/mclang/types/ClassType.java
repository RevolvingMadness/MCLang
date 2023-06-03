package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangVisitor;
import com.revolvingmadness.mclang.Variable;

import java.util.ArrayList;
import java.util.List;

public class ClassType extends Type {
	public String name;
	public List<Variable> variables;
	public FunctionType constructor;
	
	public ClassType(String name) {
		this.name = name;
		this.variables = new ArrayList<>();
	}
	
	public ClassType(ClassType other) {
		super(other.value);
		this.typeName = other.typeName;
		this.type = other.type;
		this.name = other.name;
		this.variables = new ArrayList<>(other.variables);
		this.constructor = other.constructor;
	}
	
	@Override
	public Variable getMember(String member) {
		Variable variableToGet = MCLangVisitor.getVariableFromList(variables, member);
		if (variableToGet == null) {
			throw new RuntimeException("Class '" + name + "' has to property '" + member + "'");
		}
		return variableToGet;
	}
	
	@Override
	public void assignMember(String member, Type value) {
		MCLangVisitor.assignVariableFromList(variables, member, value);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
