package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.Variable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassType extends Type {
	public String name;
	public List<Variable> variables;
	public List<FunctionType> methods;
	public FunctionType constructor;
	
	public ClassType(String name) {
		this.name = name;
		this.methods = new ArrayList<>();
		this.variables = new ArrayList<>();
	}
	
	public ClassType(ClassType other) {
		super(other.value);
		this.typeName = other.typeName;
		this.type = other.type;
		this.name = other.name;
		this.variables = new ArrayList<>(other.variables);
		this.methods = new ArrayList<>(other.methods);
		this.constructor = other.constructor;
	}
	
	@Override
	public Type getMember(String member) {
		Type variableToGet = null;
		
		for (Variable variable : variables) {
			if (Objects.equals(variable.name, member))
				variableToGet = variable.value;
		}
		
		if (variableToGet == null) {
			throw new RuntimeException("Variable '" + member + "' is not defined");
		}
		
		return variableToGet;
	}
	
	@Override
	public void assignMember(String member, Type value) {
		Variable variableToAssign = null;
		
		for (Variable variable : variables) {
			if (Objects.equals(variable.name, member))
				variableToAssign = variable;
		}
		
		if (variableToAssign != null) {
			variableToAssign.value = value;
		} else {
			variables.add(new Variable(member, value));
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}
