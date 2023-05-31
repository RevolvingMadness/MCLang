package com.revolvingmadness.mclang.types;

public class NullType extends Type {
    public Object value;
    public NullType() {
        this.value = null;
    }

    @Override
    public String toString() {
        return "null";
    }
}
