package com.cognixia.jump.corejava.strings;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = new String("Java");
		String str3 = "Java";
		
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}
		else {
			System.out.println("str1 != str2");
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}
		else {
			System.out.println("str1 != str3");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 equals str2");
		}
		else {
			System.out.println("str1 doesn't equal str2");
		}
		
		str1 = "Hello";
		
		System.out.println("str1 = " + str1);
		
	}
}
