package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.Variable;

import java.util.ArrayList;
import java.util.List;

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
	
	@Override
	public String toString() {
		return name;
	}
}
