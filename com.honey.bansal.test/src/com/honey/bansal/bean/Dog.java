package com.honey.bansal.bean;

import java.util.ArrayList;
import java.util.List;

import com.honey.bansal.interfaces.Animal;

public class Dog implements Animal {
	
	List<Animal> dg = new ArrayList<Animal>();

	@Override
	public void add(Animal dog) {
		dg.add(dog);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "dog";
	}

}
