package com.revolvingmadness.mclang.types;

import java.util.List;
import java.util.Objects;

public class ListType extends Type {
    public List<Type> value;

    public ListType(List<Type> value) {
        this.value = value;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return value.toString();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof ListType type))
            return false;
        return Objects.equals(value, type.value);
    }
}
