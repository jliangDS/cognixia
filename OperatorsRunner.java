package com.cognixia.jump.corejava.flowcontrol;

import java.util.Scanner;

public class OperatorsRunner {
	
	public static void main(String[] args) {
		
		boolean condition1 = true;
		boolean condition2 = false; 
		
		if(condition1) {
			System.out.println("Hello1");
			System.out.println("World");
		}
		else if(condition2) {
			System.out.println("Hello2");
		}
		else {
			System.out.println("Hello3");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a grade:");
		int grade = sc.nextInt();
		
		sc.close();
		
		if(grade < 70) {
			System.out.println("You did not pass");
		}
		else {
			System.out.println("You passed");
			
			if(grade == 100) {
				System.out.println("Perfect score");
			}
		}
		
		if((grade != 87) ^ (grade > 90) ) {
			System.out.println("XOR is true");
		}
	}
}
