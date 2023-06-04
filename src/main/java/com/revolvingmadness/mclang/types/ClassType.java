package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangVisitor;
import com.revolvingmadness.mclang.Variable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassType extends Type {
	public String name;
	public List<Variable> variables;
	public FunctionType constructor;
	
	public ClassType(String name) {
		this.name = name;
		this.variables = new ArrayList<>();
		this.variables.add(new Variable("this", this));
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
		return MCLangVisitor.getVariableFromList(variables, member);
	}
	
	@Override
	public Variable assignMember(String member, Type value) {
		return MCLangVisitor.assignVariableFromList(variables, member, value, null);
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof ClassType classType))
			return false;
		return Objects.equals(name, classType.name) && Objects.equals(variables, classType.variables) && Objects.equals(constructor, classType.constructor);
	}
}
