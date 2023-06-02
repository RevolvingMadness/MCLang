package com.revolvingmadness.mclang.types;


import java.util.Objects;

public class StringType extends Type {
	public String value;
	
	public StringType(String value) {
		super(value);
		this.value = value;
		this.typeName = this.getClass().getSimpleName();
	}
	
	@Override
	public Type add(Type other) {
		if (!(other instanceof StringType))
			super.add(other);
		
		return new StringType(value.concat(((StringType) other).value));
	}
	
	@Override
	public Type exponentiate(Type other) {
		if (!(other instanceof IntegerType))
			super.add(other);
		
		return new StringType(value.repeat(((IntegerType) other).value.intValue()));
	}
	
	public static boolean isStringMultiplication(Type left, Type right) {
		return left instanceof StringType || right instanceof StringType;
	}
	
	public static StringType multiply(Type left, Type right) {
		if (left instanceof StringType && right instanceof IntegerType)
			return new StringType(((StringType) left).value.repeat(((IntegerType) right).value.intValue()));
		if (left instanceof IntegerType && right instanceof StringType)
			return new StringType(((StringType) right).value.repeat(((IntegerType) left).value.intValue()));
		
		if (!(left instanceof StringType) && right instanceof IntegerType)
			throw new RuntimeException("Cannot multiply string with type '" + left.typeName + "'.");
		if (left instanceof StringType && !(right instanceof IntegerType))
			throw new RuntimeException("Cannot multiply string with type '" + right.typeName + "'.");
		
		return null;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof StringType stringType))
			return false;
		return Objects.equals(value, stringType.value);
	}
}
