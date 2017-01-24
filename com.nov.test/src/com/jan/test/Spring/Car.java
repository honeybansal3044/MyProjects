package com.jan.test.Spring;

import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String name;
	private int capacity;
	private Engine engine;
	
	private String[] names;
	private Engine[] engines;
	
	private TreeSet<String> carnames;
	
	public TreeSet<String> getCarnames() {
		return carnames;
	}
	public void setCarnames(TreeSet<String> carnames) {
		this.carnames = carnames;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCar() {
		System.out.println(name);
		System.out.println(engine.getModel());
	}

}
