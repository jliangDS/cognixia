package com.cognixia.jump.corejava.flowcontrol;

public class WhilteLoops {
	
	public static void main(String[] args) {
		
		int counter = 1;
		while(counter < 10) {
			System.out.println(counter);
			counter++;
		}
		
		counter = 10;
		
		do {
			System.out.println(counter);
			counter++;
		} while(counter < 10);
		
		int num = 1;
		while(num != 10) {
			System.out.println("num = " + num);
			num = num + 2;
			
		}
		
		boolean b = true;
		int num2 = 0;
		
		while(b) {
			
			System.out.println("num2 = " + num2);
			if(num2 % 10 == 0) {
				b = false;
			}
			num2+=2; // num2 = num2 + 2
		}
	}
}
