package com.honey.bansal.study.jan;

import com.honey.bansal.jan2.AccessModifierTest;

public class PublicTest extends AccessModifierTest{
	
	public void bye() {
		hello();
	}

	public static void main(String args[]) {
		AccessModifierTest test = new AccessModifierTest();
		test.hello();
	}
}

class PublicTest2 {
	
}
