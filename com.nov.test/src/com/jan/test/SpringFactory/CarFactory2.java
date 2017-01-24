package com.jan.test.SpringFactory;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory2 implements FactoryBean<Car> {

	public String carName;

	public void setCarName(String name) {
		this.carName = name;
	}
	
	@Override
	public Car getObject() throws Exception {
		return (Car) Class.forName(carName).newInstance();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
