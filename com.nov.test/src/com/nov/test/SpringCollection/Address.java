package com.nov.test.SpringCollection;

public class Address {
	
	private String streetName;
	private String city;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address is " + streetName + " - " + city;
	}
}
