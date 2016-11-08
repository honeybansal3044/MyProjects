package com.honey.bansal.feb;

public class ExceptionTest {

	private String testException() {
		try {
			System.out.println("Inside Try");
			return "Bye";
		}catch (Exception e){
			System.out.println("Inside catch");
			return "Hi";
		}finally {
			System.out.println("Inside finally");
		}
	}


	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		System.out.println(test.testException());
	}

}
