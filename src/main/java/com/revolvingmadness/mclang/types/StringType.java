package com.revolvingmadness.mclang.types;


import java.util.Objects;

public class StringType extends Type {
    public String value;

    public StringType(String value) {
        this.value = value;
    }

    public static boolean canMultiply(Object left, Object right) {
        return (left instanceof String && right instanceof Integer) || (left instanceof Integer && right instanceof String);
    }

    public static StringType multiply(Object left, Object right) {
        if (left instanceof String && right instanceof Integer)
            return new StringType(((String) left).repeat((Integer) right));
        if (left instanceof Integer && right instanceof String)
            return new StringType(((String) right).repeat((Integer) left));

        if (!(right instanceof Integer) && left instanceof String)
            throw new RuntimeException("Cannot multiply string with type '" + right.getClass().getName() + "'.");
        if (!(left instanceof Integer) && right instanceof String)
            throw new RuntimeException("Cannot multiply string with type '" + left.getClass().getName() + "'.");

        return null;
    }

    public StringType concat(StringType right) {
        return new StringType(this.value + right.value);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof StringType) || other == null)
            return false;
        return Objects.equals(value, ((StringType) other).value);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
