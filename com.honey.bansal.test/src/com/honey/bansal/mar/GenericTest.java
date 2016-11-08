package com.honey.bansal.mar;

import java.util.List;

public class GenericTest<T> {
	
	private int num = 0;
	private List<T> list;

	public GenericTest(int num, List<T> list) {
		this.num = num;
		this.list = list;
	}
	
	public T getRental() {
		return list.get(0);
	}
	
	public void returnRental(T car) {
		this.list.add(car);
	}
}
