package com.revolvingmadness.mclang.types;

public class NumberType extends Type {
	public Number value;
	
	public NumberType(Number value) {
		this.value = value;
		this.name = this.getClass().getSimpleName();
	}
	
	@Override
	public Type exponentiate(Type other) {
		if (!(other instanceof NumberType))
			super.exponentiate(other);
		
		Number result = Math.pow(value.doubleValue(), ((NumberType) other).value.doubleValue());
		
		return NumberType.of(result);
	}
	
	@Override
	public Type multiply(Type other) {
		if (!(other instanceof NumberType || other instanceof StringType))
			super.multiply(other);
		
		Number result = value.doubleValue() * ((NumberType) other).value.doubleValue();
		
		return NumberType.of(result);
	}
	
	@Override
	public Type divide(Type other) {
		if (!(other instanceof NumberType))
			super.divide(other);
		
		return new FloatType(value.floatValue() / ((NumberType) other).value.floatValue());
	}
	
	@Override
	public Type floorDivide(Type other) {
		if (!(other instanceof NumberType))
			super.floorDivide(other);
		
		return new IntegerType(Math.floorDiv(value.longValue(), ((NumberType) other).value.longValue()));
	}
	
	@Override
	public Type modulo(Type other) {
		if (!(other instanceof NumberType))
			super.modulo(other);
		
		return new IntegerType(Math.floorMod(value.longValue(), ((NumberType) other).value.longValue()));
	}
	
	@Override
	public Type bitwiseXor(Type other) {
		if (!(other instanceof NumberType))
			super.bitwiseXor(other);
		
		return new IntegerType(value.intValue() ^ ((NumberType) other).value.intValue());
	}
	
	@Override
	public Type bitwiseOr(Type other) {
		if (!(other instanceof NumberType))
			super.bitwiseOr(other);
		
		return new IntegerType(value.intValue() | ((NumberType) other).value.intValue());
	}
	
	@Override
	public Type bitwiseAnd(Type other) {
		if (!(other instanceof NumberType))
			super.bitwiseAnd(other);
		
		return new IntegerType(value.intValue() & ((NumberType) other).value.intValue());
	}
	
	@Override
	public Type add(Type other) {
		if (!(other instanceof NumberType))
			super.add(other);
		
		Number result = value.doubleValue() + ((NumberType) other).value.doubleValue();
		
		return NumberType.of(result);
	}
	
	@Override
	public Type subtract(Type other) {
		if (!(other instanceof NumberType))
			super.subtract(other);
		
		Number result = value.doubleValue() - ((NumberType) other).value.doubleValue();
		
		return NumberType.of(result);
	}
	
	@Override
	public Type lessThan(Type other) {
		if (!(other instanceof NumberType))
			super.lessThan(other);
		
		return new BooleanType(value.doubleValue() < ((NumberType) other).value.doubleValue());
	}
	
	@Override
	public Type lessThanOrEqualTo(Type other) {
		if (!(other instanceof NumberType))
			super.lessThanOrEqualTo(other);
		
		return new BooleanType(value.doubleValue() <= ((NumberType) other).value.doubleValue());
	}
	
	@Override
	public Type greaterThan(Type other) {
		if (!(other instanceof NumberType))
			super.greaterThan(other);
		
		return new BooleanType(value.doubleValue() > ((NumberType) other).value.doubleValue());
	}
	
	@Override
	public Type greaterThanOrEqualTo(Type other) {
		if (!(other instanceof NumberType))
			super.greaterThanOrEqualTo(other);
		
		return new BooleanType(value.doubleValue() >= ((NumberType) other).value.doubleValue());
	}
	
	public static NumberType parseNumber(String numberString) {
		try {
			return new IntegerType(Integer.parseInt(numberString));
		} catch (NumberFormatException e1) {
			try {
				return new FloatType(Float.parseFloat(numberString));
			} catch (NumberFormatException e2) {
				throw new RuntimeException("Invalid number: " + numberString);
			}
		}
	}
	
	public static NumberType of(Number number) {
		if (number.toString().endsWith(".0"))
			return new IntegerType(number);
		
		return new FloatType(number);
	}
}
