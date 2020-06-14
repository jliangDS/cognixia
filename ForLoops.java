package com.cognixia.jump.corejava.flowcontrol;

public class ForLoops {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("i = " + i);
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("i = " + i);
			
		}
		
		// Compare two strings
		for(int i = 5; i < 100; i+=3) {
			
			System.out.println("i = " + i);
		}
		
		for(int row = 0; row < 5; row++) {
			
			for(int col = 0; col < 6; col++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
