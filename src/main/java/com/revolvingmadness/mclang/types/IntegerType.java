package com.revolvingmadness.mclang.types;

public class IntegerType extends NumberType {
    public IntegerType(Number value) {
        super(value.longValue());
    }

    @Override
    public String toString() {
        return Long.toString(value.longValue());
    }
}
