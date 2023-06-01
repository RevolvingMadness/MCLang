package com.revolvingmadness.mclang.data;

import com.revolvingmadness.mclang.types.NullType;
import com.revolvingmadness.mclang.types.Type;

public class FunctionCall {
	public Type returnValue;
	
	public FunctionCall() {
		this.returnValue = new NullType();
	}
}
