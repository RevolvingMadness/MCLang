package com.revolvingmadness.mclang.types;

public class IntegerType extends NumberType {
    public IntegerType(Number value) {
        super(value.intValue());
    }

    @Override
    public String toString() {
        return Integer.toString(value.intValue());
    }
}
