package com.honey.bansal.oct;

public class TestAnonymousInner {
	public static void main(String args[]) {
		Person p = new Person() {
			@Override
			void eat() {
				System.out.println("eat");
			}
		};
		p.eat();
	}
}
