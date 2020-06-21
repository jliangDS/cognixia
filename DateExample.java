package com.cognixia.jump.corejava.date;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.text.ParseException;

public class DateExample {
	
	public static void main(String[] args) {
		
//		usingDate();
		formatDate();
//		stringToDate();
		
		
	}
	
	public static void usingDate() {
		
		Date date = new Date();
		
		System.out.println(date);
		
//		Date date2 = new Date(2015, 5, 3);
//		date2.setMonth(month);
//		date2.getDay();
		
//		System.out.println(date2);
	}
	
	public static void formatDate() {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		
		System.out.println(sdf.format(date));
	}
	
	public static void stringToDate() throws ParseException {
		
		String strDate = "05/12/2003";
		
		Date date = new SimpleDateFormat("MM/dd/yyyy").parse(strDate);
		
		System.out.println(date);
	}
}
