package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class BooleanType extends Type {
    public Boolean value;
    
    public BooleanType(boolean value) {
        super(value);
        this.value = value;
        this.stringValue = Boolean.toString(value);
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public Type booleanAnd(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(value && ((BooleanType) other).value);
    }

    @Override
    public Type booleanOr(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(value || ((BooleanType) other).value);
    }

    @Override
    public Type booleanNot() {
        return new BooleanType(!value);
    }

    @Override
    public Type bitwiseAnd(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(value & ((BooleanType) other).value);
    }

    @Override
    public Type bitwiseXor(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(value ^ ((BooleanType) other).value);
    }

    @Override
    public Type bitwiseOr(Type other) {
        if (!(other instanceof BooleanType))
            super.booleanAnd(other);

        return new BooleanType(value | ((BooleanType) other).value);
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
            return new BooleanType(((IntegerType) input).value != 0);

        if (input instanceof FloatType)
            return new BooleanType(((FloatType) input).value != (float) 0.0);

        throw new RuntimeException("Invalid boolean type '" + input.typeName + "'");
    }

    @Override
    public String toString() {
        return Boolean.toString(this.value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof BooleanType booleanType))
            return false;
        return Objects.equals(value, booleanType.value);
    }
}
