package com.honey.bansal.jan2;

import java.util.ArrayList;
import java.util.List;

import com.honey.bansal.study.jan.Animal;

public class Dog extends Animal {
	
	public int defaultVal;

	Dog(String aa) {
		super(aa);
	}

	public void bark() {
		System.out.println("Dog is barking");
	}
	
	public static void doStuff() {
		System.out.println("Doing");
	}
	
	public void checkRef(Animal animal) {
		animal.setName("Tommy");
		animal = new Dog("Dog");
	}
	
	public Object testReturnType() {
		int no = 9;
		return no;
	}
}

class DogTest {
	public static void main(String[] args) {
		Animal an = new Dog("Dog");
		an.eat();
		Dog d = (Dog) an;
		d.bark();
		d.checkRef(d);
		d.getName();
		System.out.println(d.defaultVal);
		
		int defaultVal1 = 1;
		System.out.println(defaultVal1);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		
		Object no = d.testReturnType();
		System.out.println(no);
	}

}
