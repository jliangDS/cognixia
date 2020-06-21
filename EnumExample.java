package com.cognixia.jump.corejava.enums;

import java.util.Scanner;

import com.cognixia.jump.corejava.enums.Student.Grade;

public class EnumExamples {

	public static void main(String[] args) {
		
		// getting inputs from students about them 
		
		Grade g = Grade.FRESHMAN;
		String strGrade = g.toString();
		
		System.out.println(g);
		System.out.println(g.ordinal());
		System.out.println(g.toString());
		System.out.println(g.name());
		
		System.out.println("-------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		Grade year;
		
		while(true) {
			try {
				System.out.println("What is your grade?");
				String grade = sc.nextLine().toUpperCase().trim();
				
				year = Grade.valueOf(grade);
				break;
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Give a proper grade year");
			}
		}
		
		sc.close();
		
		Student s = new Student(name, year);
		System.out.println(s);
		
		
		
		
	}

}
