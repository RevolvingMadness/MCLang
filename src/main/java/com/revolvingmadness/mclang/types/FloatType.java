package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class FloatType extends NumberType {
    public FloatType(Number value) {
        super(value.floatValue());
    }

    @Override
    public String toString() {
        return Float.toString(value.floatValue());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof FloatType) || other == null)
            return false;
        return Objects.equals(value, ((FloatType) other).value);
    }

}
