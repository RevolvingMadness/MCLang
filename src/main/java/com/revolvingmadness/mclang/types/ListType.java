package com.revolvingmadness.mclang.types;

import java.util.List;

public class ListType extends Type {
    public List<Type> value;

    public ListType(List<Type> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
