package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class IntegerType extends NumberType {
    public IntegerType(Number value) {
        super(value.intValue());
    }

    @Override
    public String toString() {
        return Integer.toString(value.intValue());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof IntegerType) || other == null)
            return false;
        return Objects.equals(value, ((IntegerType) other).value);
    }
}
