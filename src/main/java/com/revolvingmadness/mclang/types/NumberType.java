package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangInterpreter;

public class NumberType extends Type {
    public Number value;

    public NumberType(Number value) {
        this.value = value;
    }

    public static NumberType exponentiate(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("**", left, right);

        if (isFloatAndInteger(left, right))
            return new FloatType(Math.pow(left.value.doubleValue(), right.value.doubleValue()));

        return new IntegerType(Math.pow(left.value.doubleValue(), right.value.doubleValue()));
    }

    public static NumberType multiply(NumberType left, NumberType right) {
        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("*", left, right);

        if (isFloatAndInteger(left, right))
            return new FloatType(left.value.floatValue() * right.value.floatValue());

        return new IntegerType(left.value.intValue() * right.value.intValue());
    }

    public static NumberType divide(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("/", left, right);

        return new FloatType(left.value.floatValue() / right.value.floatValue());
    }

    public static NumberType floorDivide(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("//", left, right);

        return new IntegerType(Math.floorDiv(left.value.longValue(), right.value.longValue()));
    }

    public static NumberType modulo(NumberType left, NumberType right) {
        if (!bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("%", left, right);

        return new IntegerType(Math.floorMod(left.value.longValue(), right.value.longValue()));
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

    public static IntegerType bitwiseXor(NumberType left, NumberType right) {
        return new IntegerType(left.value.intValue() ^ right.value.intValue());
    }

    public static IntegerType bitwiseOr(NumberType left, NumberType right) {
        return new IntegerType(left.value.intValue() | right.value.intValue());
    }

    public static IntegerType bitwiseAnd(NumberType left, NumberType right) {
        return new IntegerType(left.value.intValue() & right.value.intValue());
    }

    public static boolean isFloatAndInteger(NumberType left, NumberType right) {
        return (left instanceof FloatType || right instanceof FloatType) && (left instanceof IntegerType || right instanceof IntegerType);
    }

    public static boolean bothNumbers(Type left, Type right) {
        return left instanceof NumberType && right instanceof NumberType;
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
}
