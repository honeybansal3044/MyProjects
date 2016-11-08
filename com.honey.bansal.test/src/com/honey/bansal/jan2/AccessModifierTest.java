package com.honey.bansal.jan2;

import com.honey.bansal.interfaces.ConstantTest;

public class AccessModifierTest implements ConstantTest {

	public static void main(String args[]) {
		int j = i;
	}
	
	public void hello() {
		final int j = 0;
	}
}
