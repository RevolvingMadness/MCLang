package com.revolvingmadness.mclang.types;

import com.revolvingmadness.mclang.MCLangInterpreter;

import java.util.Objects;

public abstract class Type {
    public Object value;
    public String typeName;
    public Class<? extends Type> type;
    
    public Type(Object value) {
        this.typeName = this.getClass().getSimpleName();
        this.value = value;
        this.type = this.getClass();
    }
    
    public Type() {
        this.typeName = this.getClass().getSimpleName();
        this.value = null;
        this.type = this.getClass();
    }
    
    public static Class<? extends Type> of(String input) {
        switch (input) {
            case "bool" -> {
                return BooleanType.class;
            }
            case "dict" -> {
                return DictType.class;
            }
            case "float" -> {
                return FloatType.class;
            }
            case "func" -> {
                return FunctionType.class;
            }
            case "int" -> {
                return IntegerType.class;
            }
            case "list" -> {
                return ListType.class;
            }
            case "null", "void" -> {
                return NullType.class;
            }
            case "number" -> {
                return NumberType.class;
            }
            case "str" -> {
                return StringType.class;
            }
        }
        
        throw new RuntimeException("Unknown data type '" + input + "'");
    }
	
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
    
    public Type increment() {
        MCLangInterpreter.throwBinOpException("++", this);
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
    
    public Type getMember(String member) {
        throw new RuntimeException("Type '" + this.getClass().getSimpleName() + "' has no properties");
    }
    
    public Type assignMember(String member) {
        throw new RuntimeException("Type '" + this.getClass().getSimpleName() + "' has no properties");
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
