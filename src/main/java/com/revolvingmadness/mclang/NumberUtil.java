package com.revolvingmadness.mclang;

public class NumberUtil {
    public static boolean bothNumbers(Object left, Object right) {
        return left instanceof Number && right instanceof Number;
    }

    public static boolean isFloatAndInteger(Object left, Object right) {
        return (left instanceof Float || right instanceof Float) && (left instanceof Integer || right instanceof Integer);
    }

    public static Number parseNumber(String numberString) {
        try {
            return Integer.parseInt(numberString);
        } catch (NumberFormatException e1) {
            try {
                return Float.parseFloat(numberString);
            } catch (NumberFormatException e2) {
                throw new RuntimeException("Invalid number: " + numberString);
            }
        }
    }
}
