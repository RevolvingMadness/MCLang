package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class IntegerType extends NumberType {
    public IntegerType(Number value) {
        super(value.longValue());
    }

    @Override
    public String toString() {
        return Long.toString(value.longValue());
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof IntegerType type))
            return false;
        return Objects.equals(value, type.value);
    }
}
