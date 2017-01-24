package com.jan.test.SpringFactory;

public class CarFactory {

	public static String carName;

	public static void setCarName(String name) {
		CarFactory.carName = name;
	}

	public static Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Car) Class.forName(carName).newInstance();
	}

	public String carName2;

	public void setCarName2(String name) {
		this.carName2 = name;
	}

	public Car getCar2() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Car) Class.forName(carName).newInstance();
	}
}
