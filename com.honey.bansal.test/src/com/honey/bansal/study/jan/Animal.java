package com.honey.bansal.study.jan;

public class Animal {
	
	private String name;
	
	public Animal(String aa) {
		System.out.println("Hello " + aa);
	}

	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public static void doStuff() {
		System.out.println("doing");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}
}
