package com.revolvingmadness.mclang;

import com.revolvingmadness.mclang.types.Type;

import java.util.Objects;

public class Variable {
	public String name;
	public Type value;
	public Class<? extends Type> type;
	
	public Variable(String name, Type value, Class<? extends Type> type) {
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	public Variable(String name, Type value) {
		this.name = name;
		this.value = value;
		this.type = null;
	}
	
	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "=" + value;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof Variable variable))
			return false;
		return Objects.equals(name, variable.name) && Objects.equals(value, variable.value);
	}
}
