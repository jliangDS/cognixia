package com.cognixia.jump.corejava.regex;

public class StringRegex {

	public static void main(String[] args) {
		
		String original = "abbacaenibib";
		
		if(original.matches(".*ba*b.*")) {
			System.out.println("String matches"); // .*ba*b.*
		}
		else {
			System.out.println("String doesn't matches"); // ba*b
		}
		
		String modified = original.replaceAll("[aeiou]b", "@");
		
		System.out.println("modified = " + modified);
	}

}
