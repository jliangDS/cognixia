package com.cognixia.jump.corejava.enums;

public class ElementRunner {

	public static void main(String[] args) {
		
		Element element = Element.ARGON;
		
		System.out.println(element);
		System.out.println(element.symbol);
		
		element.hello();
		
		Element.staticHello();
		
	}

}
