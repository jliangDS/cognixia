package com.cognixia.jump.corejava.compositionandinheritance;

public class BikeRunner {

	public static void main(String[] args) {
		
		Bike bike = new Bike("red");
		
		bike.rideBikeOneMile();
		System.out.println("Refill air? " + bike.refillTireAir());
	}

}
