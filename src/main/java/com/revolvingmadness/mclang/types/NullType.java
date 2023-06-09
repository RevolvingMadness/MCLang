package com.revolvingmadness.mclang.types;

import java.util.Objects;

public class NullType extends Type {
    public Object value;
    
    public NullType() {
        this.value = null;
        this.stringValue = "null";
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "null";
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof NullType nullType))
            return false;
        return Objects.equals(value, nullType.value);
    }
}
