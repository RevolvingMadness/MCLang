package com.revolvingmadness.mclang.types;

public class FloatType extends NumberType {
    public FloatType(Number value) {
        super(value.doubleValue());
    }

    @Override
    public String toString() {
        return Double.toString(value.doubleValue());
    }
}
