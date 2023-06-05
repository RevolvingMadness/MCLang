package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class IntegerType extends NumberType {
    public Integer value;
    
    public IntegerType(Number value) {
        super(value.intValue());
        this.value = value.intValue();
        this.stringValue = Integer.toString(this.value);
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return Integer.toString(value);
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
