package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class FloatType extends NumberType {
    public Float value;
    
    public FloatType(Number value) {
        super(value.floatValue());
        this.value = value.floatValue();
        this.stringValue = Float.toString(this.value);
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return Float.toString(value);
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
