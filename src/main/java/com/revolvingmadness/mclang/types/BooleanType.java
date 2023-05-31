package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangInterpreter;

import java.util.Objects;

public class BooleanType extends Type {
    public Boolean value;

    public BooleanType(boolean value) {
        this.value = value;
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

        throw new RuntimeException("Invalid boolean type '" + input.getClass().getSimpleName() + "'");
    }

    public static BooleanType lessThan(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("<", left, right);

        return new BooleanType(left.value.floatValue() < right.value.floatValue());
    }

    public static BooleanType lessThanOrEqualTo(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("<=", left, right);

        return new BooleanType(left.value.floatValue() <= right.value.floatValue());
    }

    public static BooleanType greaterThan(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException(">", left, right);

        return new BooleanType(left.value.floatValue() > right.value.floatValue());
    }

    public static BooleanType greaterThanOrEqualTo(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException(">=", left, right);

        return new BooleanType(left.value.floatValue() >= right.value.floatValue());
    }

    public static BooleanType notEqualTo(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("!=", left, right);

        return new BooleanType(left.value.floatValue() != right.value.floatValue());
    }

    public static BooleanType equalTo(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("==", left, right);

        return new BooleanType(left.value.floatValue() == right.value.floatValue());
    }

    public static BooleanType booleanOr(BooleanType left, BooleanType right) {
        return new BooleanType(left.value || right.value);
    }

    public static BooleanType booleanAnd(BooleanType left, BooleanType right) {
        return new BooleanType(left.value && right.value);
    }

    public static BooleanType booleanNot(BooleanType input) {
        return new BooleanType(!input.value);
    }
    
    @Override
    public String toString() {
        return Boolean.toString(this.value);
    }
}
