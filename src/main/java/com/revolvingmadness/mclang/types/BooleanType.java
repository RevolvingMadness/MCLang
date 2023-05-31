package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class BooleanType extends Type {
    public Boolean value;

    public BooleanType(boolean value) {
        this.value = value;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public Type booleanAnd(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(((BooleanType) other).value && value);
    }

    @Override
    public Type booleanOr(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(((BooleanType) other).value || value);
    }

    @Override
    public Type booleanNot() {
        return new BooleanType(!value);
    }

    @Override
    public Type bitwiseAnd(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(((BooleanType) other).value & value);
    }

    @Override
    public Type bitwiseXor(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(((BooleanType) other).value ^ value);
    }

    @Override
    public Type bitwiseOr(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(((BooleanType) other).value | value);
    }

    public static BooleanType getBoolean(String input) {
        return new BooleanType(Objects.equals(input, "true"));
    }

    public static BooleanType valueOf(Type input) {
        if (input instanceof BooleanType)
            return (BooleanType) input;

        if (input instanceof StringType)
            return new BooleanType(!Objects.equals(((StringType) input).value, ""));

        if (input instanceof IntegerType)
            return new BooleanType(((IntegerType) input).value.intValue() != 0);

        if (input instanceof FloatType)
            return new BooleanType(((FloatType) input).value.floatValue() != (float) 0.0);

        throw new RuntimeException("Invalid boolean type '" + input.name + "'");
    }

    @Override
    public String toString() {
        return Boolean.toString(this.value);
    }
}
