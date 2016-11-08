package com.honey.bansal.mar;

import com.honey.bansal.bean.Dog;
import com.honey.bansal.interfaces.Animal;


public class MyOuter {
	
	private int age = 10;
	
	protected void accessInnerClass() {
		MyInner myin = new MyInner();
		myin.showOuterAge();
		age = age + 10;
		System.out.println("Bye");
	}
	
	private class MyInner {
		public void showOuterAge() {
			System.out.println(age);
			age = age + 10;
			System.out.println(MyOuter.this.age);
		}
	}
	
	private void InnerClassFn() {
		class MethodInnerClass {
			private void InnerMethod() {
				System.out.println(age);
			}
		}
	}
	
	public static void main(String[] args) {
		MyOuter myou = new MyOuter() {
			public void accessInnerClass() {
				System.out.println("hello");
			}
		};
		myou.accessInnerClass();
		
		MyInner mm = myou.new MyInner();
		mm.showOuterAge();
		new MyOuter().new MyInner().showOuterAge();
		
		myou.new MyInner().showOuterAge();
		
		Animal a = new Animal() {
			@Override
			public void add(Animal animal) {
				System.out.println("Dog");
			}
		};
		
		a.add(new Dog());
		
		System.out.println(a.getClass());
	}
}