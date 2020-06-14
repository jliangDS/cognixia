package com.cognixia.jump.corejava.flowcontrol;

public class BreakAndContinue {

	public static void main(String[] args) {
		
//		breakContinue();
//		breakContinue2();
		
		System.out.println("num returned is: " + returnAndBreak(25));
		
	}
	
	public static void breakContinue() {
		
		for(int i = 0; i < 100; i++) {
			
			if(i%2 == 0) { // continue -> end iteration here, go to next iteration
				continue;
			}
			else if (i > 10) {
				break; // exit the loop
			}
			
			System.out.println("i = " + i);
		}
	}
	
	public static void breakContinue2() {
		
		int count = 0;
		
		while(true) {
			
			count++;
			
			if(count % 3 == 0) { // no multiples of 3 will print
				continue;
			}
			else if (count > 25) { // will exit loop once count above 25
				break;
			}
			
			System.out.println("count = " + count);
		}
	}
	
//	public static int mult(int x1, int x2) {
//		
//	}
	
	public static int returnAndBreak(int max) {
		
		int sum = 0;
		
		for(int i = 1; i < max; i++) {
			
			if(i % 10 == 0) {
				return i;
			}
			else if(i % 2 == 0) {
				System.out.println("i = " + i);
			}
			else {
				continue;
			}
			
			sum = sum + i;
			
		}
		
		return sum;
	}
}
