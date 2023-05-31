package com.revolvingmadness.mclang.types;

public class NullType extends Type {
    public Object value;
    public NullType() {
        this.value = null;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "null";
    }
}
