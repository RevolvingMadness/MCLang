package com.revolvingmadness.mclang.types;

public class FloatType extends NumberType {
    public FloatType(Number value) {
        super(value.floatValue());
    }

    @Override
    public String toString() {
        return Float.toString(value.floatValue());
    }
}
