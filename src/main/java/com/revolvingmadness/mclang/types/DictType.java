package com.revolvingmadness.mclang.types;

import java.util.Map;
import java.util.Objects;

public class DictType extends Type {
    public Map<StringType, Type> value;

    public DictType(Map<StringType, Type> value) {
        super(value);
        this.value = value;
        StringBuilder stringValue = new StringBuilder("{");
        for (StringType key : value.keySet()) {
            stringValue.append(key);
            stringValue.append(": ");
            stringValue.append(value.get(key));
            stringValue.append(", ");
        }
        stringValue.delete(stringValue.length()-2, stringValue.length());
        stringValue.append("}");
        this.stringValue = stringValue.toString();
        this.typeName = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return stringValue;
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
