package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangInterpreter;

import java.util.Objects;

public abstract class Type {
    public Object value;
    public String name;

    public Type exponentiate(Type other) {
        MCLangInterpreter.throwBinOpException("**", this, other);
        return null;
    }

    public Type multiply(Type other) {
        MCLangInterpreter.throwBinOpException("*", this, other);
        return null;
    }

    public Type divide(Type other) {
        MCLangInterpreter.throwBinOpException("/", this, other);
        return null;
    }
    public Type floorDivide(Type other) {
        MCLangInterpreter.throwBinOpException("//", this, other);
        return null;
    }

    public Type modulo(Type other) {
        MCLangInterpreter.throwBinOpException("%", this, other);
        return null;
    }

    public Type add(Type other) {
        MCLangInterpreter.throwBinOpException("+", this, other);
        return null;
    }

    public Type subtract(Type other) {
        MCLangInterpreter.throwBinOpException("-", this, other);
        return null;
    }

    public Type lessThan(Type other) {
        MCLangInterpreter.throwBinOpException("<", this, other);
        return null;
    }

    public Type lessThanOrEqualTo(Type other) {
        MCLangInterpreter.throwBinOpException("<=", this, other);
        return null;
    }

    public Type greaterThan(Type other) {
        MCLangInterpreter.throwBinOpException(">", this, other);
        return null;
    }

    public Type greaterThanOrEqualTo(Type other) {
        MCLangInterpreter.throwBinOpException(">=", this, other);
        return null;
    }

    public Type bitwiseAnd(Type other) {
        MCLangInterpreter.throwBinOpException("&", this, other);
        return null;
    }

    public Type bitwiseXor(Type other) {
        MCLangInterpreter.throwBinOpException("^", this, other);
        return null;
    }

    public Type bitwiseOr(Type other) {
        MCLangInterpreter.throwBinOpException("|", this, other);
        return null;
    }

    public Type booleanAnd(Type other) {
        MCLangInterpreter.throwBinOpException("&&", this, other);
        return null;
    }

    public Type booleanOr(Type other) {
        MCLangInterpreter.throwBinOpException("||", this, other);
        return null;
    }

    public Type booleanNot() {
        MCLangInterpreter.throwBinOpException("!", this);
        return null;
    }
    
    public Type unary() {
        MCLangInterpreter.throwBinOpException("-", this);
        return null;
    }

    @Override
    public boolean equals(Object other) {
        throw new RuntimeException("Please implement an equals method for class '" + this.getClass().getSimpleName() + "'");
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
