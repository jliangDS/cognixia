package com.cognixia.jump.corejava.classesandobjects;

import com.cognixia.jump.corejava.flowcontrol.BreakAndContinue;

public class ClassAndInstanceMethods {
	
	public static void main(String[] args) {
		
		// instance method -> need to create an object to use them
		// 				   -> accessing them through that object
//		Vehicle v = new Vehicle("car", "red", 4);
//		v.setType("truck");
		
		if(Vehicle.milesTillOilChange(1000)) {
			System.out.println("get oil change");
		}
		else {
			System.out.println("no oil change");
		}
		
		
		// class method -> static methods
		//				-> access them through the class 
		//				-> don't need to create an object to use them		
		BreakAndContinue.breakContinue();
		
		Math.abs(3.4);
	}
}
