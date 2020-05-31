package com.cognixia.jump.corejava.strings;

public class CodingChallenge {
	
	public static void reverse2(String str) {
		for(int i=str.length(); i > 0; i--) {
			System.out.print(str.charAt(i-1));
		}
	}
	
	public static void reverse3(String str) {
		System.out.println();

		String[] words = str.split(" ");
		for(int i=0; i<words.length; i++) {
			StringBuilder sbuild = new StringBuilder(words[i]);
			System.out.print(sbuild.reverse() + " ");
		}
	}

	public static void main(String[] args) {
		
		StringBuilder sbuild = new StringBuilder("Hi");
		sbuild.reverse();
		System.out.println(sbuild.toString());
		
		reverse2("Hi");
		
		reverse3("Hello,  World great");
	}

}
