package com.cognixia.jump.corejava.flowcontrol;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
	System.out.println("Enter a rating from 1 to 5");
	
	Scanner sc = new Scanner(System.in);
	int rating = sc.nextInt();
	
	try {
		rating = sc.nextInt();
	} catch(InputMismatchException e) {
		System.out.println("Expected a number");
	}
	
	sc.close();
	
	switch (rating) {
	case 1:
		System.out.println("Poor review");
		break;
	case 2:
		System.out.println("Not too good review");
		break;
	case 3:
		System.out.println("Okay review");
		break;
	case 4:
		System.out.println("Good review");
		break;
	case 5:
		System.out.println("Excellent review");
		break;
	default:
		System.out.println("Not valid review");
		break;
	}
	
	}
}
