package com.revolvingmadness.mclang.builtins;

import com.revolvingmadness.mclang.types.NumberType;

public class MathLibrary extends Library {
	public MathLibrary() {
		super("math");
	}
	
	public static NumberType abs(NumberType number) {
		return NumberType.of(Math.abs(number.value.floatValue()));
	}
	
	public static NumberType max(NumberType left, NumberType right) {
		return NumberType.of(Math.max(left.value.floatValue(), right.value.floatValue()));
	}
	
	public static NumberType min(NumberType left, NumberType right) {
		return NumberType.of(Math.min(left.value.floatValue(), right.value.floatValue()));
	}
}
