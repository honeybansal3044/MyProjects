package com.edu.spring;

public class Triangle_DepInject_Preemptive {

	private String type;
	private int height;
	
	public void setType(String type) {
		this.type = type;
	}

	// These are all constructors where we have injected dependency through Constructor.
	public Triangle_DepInject_Preemptive (String type) {
		this.type = type;
	}
	
	public Triangle_DepInject_Preemptive (int height) {
		this.height = height;
	}
	
	public Triangle_DepInject_Preemptive (String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	// Uncomment this line and this will be Setter Injection.
	/*public void setType(String type) {
		this.type = type;
	}*/



	public void draw() {
		System.out.println("Triangle Drawn" +" type = " +type+" height = " +height);
	}
}
