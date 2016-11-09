package com.honey.bansal.jan2;

public class Test2 extends AccessModifierTest{

	public static void main(String[] args) {
		AccessModifierTest test = new AccessModifierTest();
		test.hello();
	}
	
	public void test1() {
		hello();
	}

}
