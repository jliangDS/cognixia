package com.cognixia.jump.corejava.enums;

public enum Element {

	NITROGEN("N"), OXYGEN("O"), ARGON("Ar"), CARBON("C");
	
	public final String symbol;
	
	private Element(String symbol) {
		this.symbol = symbol;
	}
	
	public void hello() {
		System.out.println("Hello I am a " + this.name() + " element");
	}
	
	public static void staticHello() {
		System.out.println("Hello");
	}
	
}
