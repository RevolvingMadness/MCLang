package com.revolvingmadness.mclang.types;

import java.util.ArrayList;
import java.util.List;

public class ListType extends Type {
    public List<Type> value;

    public ListType(List<Type> value) {
        this.value = value;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public Type add(Type other) {
        if (!(other instanceof ListType))
            super.add(other);

        List<Type> result = new ArrayList<>();

        result.addAll(value);
        result.addAll(((ListType) other).value);

        return new ListType(result);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
