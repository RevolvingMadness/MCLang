package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangInterpreter;

import java.util.Objects;

public class NumberType extends Type {
    public Number value;

    public NumberType(Number value) {
        this.value = value;
    }

    public static boolean bothNumbers(Object left, Object right) {
        return left instanceof NumberType && right instanceof NumberType;
    }

    public static NumberType divide(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("/", left, right);

        return new FloatType(left.value.floatValue() / right.value.floatValue());
    }

    public static NumberType add(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("+", left, right);

        if (isFloatAndInteger(left, right))
            return new FloatType(left.value.floatValue() + right.value.floatValue());

        return new IntegerType(left.value.floatValue() + right.value.floatValue());
    }

    public static NumberType subtract(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("-", left, right);

        if (isFloatAndInteger(left, right))
            return new FloatType(left.value.floatValue() - right.value.floatValue());

        return new IntegerType(left.value.floatValue() - right.value.floatValue());
    }

    public static IntegerType bitwiseAnd(IntegerType left, IntegerType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("&", left, right);

        return new IntegerType(left.value.intValue() & right.value.intValue());
    }

    public static NumberType multiply(NumberType left, NumberType right) {
        if (isFloatAndInteger(left, right))
            return new FloatType(left.value.floatValue() * right.value.floatValue());

        return new IntegerType(left.value.intValue() * right.value.intValue());
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

    public static boolean isFloatAndInteger(NumberType left, NumberType right) {
        return (left instanceof FloatType || right instanceof FloatType) && (left instanceof IntegerType || right instanceof IntegerType);
    }


    public static BooleanType equalTo(NumberType left, NumberType right) {
        if (left instanceof FloatType || right instanceof FloatType)
            return new BooleanType(Objects.equals(left.value.floatValue(), right.value.floatValue()));

        return new BooleanType(Objects.equals(left.value, right.value));
    }
}
