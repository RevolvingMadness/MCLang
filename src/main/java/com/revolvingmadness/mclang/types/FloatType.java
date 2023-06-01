package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class FloatType extends NumberType {
    public FloatType(Number value) {
        super(value.doubleValue());
    }

    @Override
    public String toString() {
        return Double.toString(value.doubleValue());
    }
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof FloatType type))
            return false;
        return Objects.equals(value, type.value);
    }
    
}
