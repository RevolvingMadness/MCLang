package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class BooleanType extends Type {
    public int intValue;
    public boolean booleanValue;

    public BooleanType(boolean booleanValue) {
        this.booleanValue = booleanValue;
        this.intValue = booleanValue ? 1 : 0;
    }

    public static BooleanType getBoolean(String input) {
        return new BooleanType(Objects.equals(input, "true"));
    }

    public static BooleanType valueOf(Object input) {
        if (input instanceof Boolean)
            return new BooleanType((Boolean) input);

        if (input instanceof BooleanType)
            return (BooleanType) input;

        if (input instanceof StringType)
            return new BooleanType(!Objects.equals(((StringType) input).value, ""));

        if (input instanceof IntegerType)
            return new BooleanType(((IntegerType) input).value.intValue() != 0);

        if (input instanceof FloatType)
            return new BooleanType(((FloatType) input).value.floatValue() != (float) 0.0);

        throw new RuntimeException("Invalid boolean type '" + input.getClass().getName() + "'");
    }

    public static BooleanType booleanOr(BooleanType left, BooleanType right) {
        return new BooleanType(left.booleanValue || right.booleanValue);
    }

    public static BooleanType equalTo(BooleanType left, BooleanType right) {
        return new BooleanType(left.booleanValue == right.booleanValue);
    }

    public static BooleanType bitwiseOr(BooleanType left, BooleanType right) {
        return new BooleanType(left.booleanValue | right.booleanValue);
    }

    public static BooleanType bitwiseXor(BooleanType left, BooleanType right) {
        return new BooleanType(left.booleanValue ^ right.booleanValue);
    }

    public static BooleanType booleanAnd(BooleanType left, BooleanType right) {
        return new BooleanType(left.booleanValue && right.booleanValue);
    }

    public static BooleanType booleanNot(BooleanType input) {
        return new BooleanType(!input.booleanValue);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof BooleanType) || other == null)
            return false;
        return booleanValue == ((BooleanType) other).booleanValue;
    }

    @Override
    public String toString() {
        return Boolean.toString(this.booleanValue);
    }
}
