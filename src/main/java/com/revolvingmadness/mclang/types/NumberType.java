package com.revolvingmadness.mclang.types;

public abstract class NumberType extends Type {
	public Number value;
	
	public NumberType(Number value) {
		super(value);
		this.value = value;
		this.typeName = this.getClass().getSimpleName();
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
		if (!(other instanceof NumberType))
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
	public Type increment() {
		return NumberType.of(value.doubleValue()+1);
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
	
	@Override
	public Type unary() {
		return NumberType.of(-value.doubleValue());
	}
	
	public static NumberType parseNumber(String numberString) {
		NumberType result;
		try {
			result = new IntegerType(Integer.parseInt(numberString));
		} catch (NumberFormatException e1) {
			try {
				result = new FloatType(Float.parseFloat(numberString));
			} catch (NumberFormatException e2) {
				throw new RuntimeException("Invalid number: " + numberString);
			}
		}
		return of(result.value);
	}
	
	public static NumberType of(Number number) {
		if (number.toString().contains(".")) {
			if (number.toString().endsWith(".0")) {
				return new IntegerType(number);
			}
			return new FloatType(number);
		}
		
		return new IntegerType(number);
	}
}
