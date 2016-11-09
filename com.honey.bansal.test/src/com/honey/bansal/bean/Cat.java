package com.honey.bansal.bean;

import java.util.ArrayList;
import java.util.List;

import com.honey.bansal.interfaces.Animal;

public class Cat implements Animal{
	
	List<Animal> dg = new ArrayList<Animal>();

	@Override
	public void add(Animal animal) {
		dg.add(animal);
		
	}

}
