package com.revolvingmadness.mclang.types;

import java.util.Objects;

public abstract class Type {
    public Object value;

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (!(other instanceof Type) || other == null)
            return false;
        return Objects.equals(value, ((Type) other).value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
