package com.honey.bansal.mar;

import java.util.ArrayList;
import java.util.List;

import com.honey.bansal.bean.Apartment;
import com.honey.bansal.bean.Dog;
import com.honey.bansal.interfaces.Animal;

public class CollectionsTest {
	
	static void test() {
		Apartment a = new Apartment();
		a.setName("LOG");
	}

	public static void main(String[] args) {
		test();
		System.gc();	
		String aa = "hello";
		String aa1 = "hello";
		
		Integer ii = new Integer(11);
		Integer iii = new Integer(11);
		
		System.out.println((aa == aa1) + "-" + (ii == iii));
		
		CollectionsTest ct = new CollectionsTest();
		ct.makeArrayList(new Dog());
	}
	
	public <T extends Animal> void makeArrayList(T t) {
		List<T> list = new ArrayList<T>();
		list.add(t);
		System.out.println(list.get(list.size()-1));
	}
}
