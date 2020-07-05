package com.cognixia.jump.corejava.compositionandinheritance;

public class Wheel {
	
	private int tirePressure;
	
	public Wheel(int tirePressure) {
		super();
		this.tirePressure = tirePressure;
	}
	
	public int getTirePressure() {
		return tirePressure;
	}
	
	public void setTirePressure(int tirePressure) {
		this.tirePressure = tirePressure;
	}
	
	public void decreasePressure() {
		tirePressure--;
	}
	
	
}
