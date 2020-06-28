package com.cognixia.jump.corejava.classesandobjects;

public class Vehicle {

	// attributes
	private String type;
	private String color;
	private int wheels;
	
	public Vehicle() {
		
	}
	
	public void describe() {
		
	}
	
	public String getType() {
		return type;
		
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public static boolean milesTillOilChange(int miles) {
		
		int dif = 2000 - miles;
		
		if(dif > 0) {
			return false;
		}
		return true;
	}
	
}
