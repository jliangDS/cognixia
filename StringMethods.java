package com.cognixia.jump.corejava.strings;

import java.util.*;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		System.out.println("Length: " + str.length());
		System.out.println("CharAt: " + str.charAt(7));
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(str.charAt(i) + " is a vowel");
				break;
			
			default: 
				System.out.println(str.charAt(i) + " is a constant");
				break;
			}
		}
		
		// indexOf() -> return the first instance of the character specified
		System.out.println("First instance of l: " + str.indexOf('l'));
		System.out.println("First instance of l after index 7: " + str.indexOf('l', 7));
		
		// substring() -> grab a certain section of a string and return it back
		System.out.println("Substring between index 3 to 7: " + str.substring(3, 7));
		System.out.println("Substring starting at index 4: " + str.substring(4)); 
		
		// CompareTo() -> compares two strings lexicographically (compare them alphabetically) 
		String a = "a";
		String b = "b";
		String a2 = new String("a"); // stored in heap memory
		
		System.out.println("a compared to b: " + a.compareTo(b));
		System.out.println("b compared to a: " + b.compareTo(a));
		System.out.println("a compared to b: " + a.compareTo(a2));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your favorite color?");
		String color = sc.nextLine().trim().toLowerCase();
		
		if(color.equals("red")) {
			System.out.println("Your favorite color is red");
		}
		else {
			System.out.println("Your favorite color is not red");
		}
		
		String color2 = "RED";
		if(color.equalsIgnoreCase(color)) {
			System.out.println("color and color2 are the same");
		}
	}

}
