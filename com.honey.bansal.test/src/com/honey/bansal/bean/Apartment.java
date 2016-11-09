package com.honey.bansal.bean;

import java.io.Serializable;

public class Apartment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4794954718994068373L;
	private String name;
	private String address;
	private String floor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	protected void finalize() {
		System.out.println("finalize");
	}
}
