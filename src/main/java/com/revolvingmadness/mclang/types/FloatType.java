package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class FloatType extends NumberType {
    public Double value;
    
    public FloatType(Number value) {
        super(value.doubleValue());
        this.value = value.doubleValue();
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof FloatType floatType))
            return false;
        return Objects.equals(value, floatType.value);
    }
    
}
