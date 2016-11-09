package com.honey.bansal.mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.honey.bansal.bean.Dog;
import com.honey.bansal.interfaces.Animal;

public class CollectionSearch {
	
	static class NextedClassTest {
		void getName1() {
			System.out.println("Hello");
		}
	}
	
	private String getName() {
		return "Honey";
	}

	enum Pets {DOG, CAT, HORSE};

	public static void main(String[] args) {
		
		String[] sa = {"honey", "isha", "bansal", "goel"};
		Arrays.sort(sa);
		System.out.println(Arrays.binarySearch(sa, "bansal"));
		
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		Integer[] ai = new Integer[5];
		Object[] a = al.toArray();
		a[0] = 10;
		
		ai = al.toArray(ai);
		
		System.out.println(ai[2]);
		
		List<Animal> dg = new ArrayList<Animal>();
		dg.add(new Dog());
		
		CollectionSearch aa = new CollectionSearch();
		aa.addAnimal(dg);
		
	}
	
	public void addAnimal(List<?> animals) {
		//animals.add(new Dog());
	}
}
