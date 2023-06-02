package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class IntegerType extends NumberType {
    public Long value;
    
    public IntegerType(Number value) {
        super(value.longValue());
        this.value = value.longValue();
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return Long.toString(value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof IntegerType integerType))
            return false;
        return Objects.equals(value, integerType.value);
    }
}
