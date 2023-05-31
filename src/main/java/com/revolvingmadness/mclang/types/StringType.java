package com.revolvingmadness.mclang.types;


public class StringType extends Type {
    public String value;

    public StringType(String value) {
        this.value = value;
        this.name = this.getClass().getSimpleName();
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
            return new StringType(((StringType)left).value.repeat(((IntegerType)right).value.intValue()));
        if (left instanceof IntegerType && right instanceof StringType)
            return new StringType(((StringType)right).value.repeat(((IntegerType)left).value.intValue()));

        if (!(left instanceof StringType) && right instanceof IntegerType)
            throw new RuntimeException("Cannot multiply string with type '" + left.name + "'.");
        if (left instanceof StringType && !(right instanceof IntegerType))
            throw new RuntimeException("Cannot multiply string with type '" + right.name + "'.");

        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
