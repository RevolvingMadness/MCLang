package com.revolvingmadness.mclang.types;

import java.util.Map;

public class DictType extends Type {
    public Map<StringType, Type> value;

    public DictType(Map<StringType, Type> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
