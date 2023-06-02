package com.revolvingmadness.mclang.types;

import java.util.Map;
import java.util.Objects;

public class DictType extends Type {
    public Map<StringType, Type> value;

    public DictType(Map<StringType, Type> value) {
        super(value);
        this.value = value;
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return value.toString();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof DictType dictType))
            return false;
        return Objects.equals(value, dictType.value);
    }
}
