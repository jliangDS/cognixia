package com.cognixia.jump.corejava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		
		// match an email for a company 
		// [first name].[last name]@Cognixia.com
		
		// String regex = "^[A-Za-z]+\\.[A-Za-z]+@cognixia\\.com";
		// String temp = "\\";
		// String email = "Orquidia.Moreno@cognixia.com";
		
		String regex = "[A-Za-z]+\\d{3}@cognixia\\.com";
		String email = "john123@cognixia.com";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		System.out.println("Does email match regex? " + matcher.matches());
		
		System.out.println(matcher.pattern());
		
		// create a regex to format a simple email like this: 
		// [name][three numbers]@cognixia.com
		
		String str = "bbcababcabbbaaaabac";
		String reg = "ba*b";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		
		System.out.println("Match the pattern to string: " + m.matches());
		System.out.println("Find the pattern in the string: " + m.find());
		System.out.println("Find pattern starting at index 10: " + m.find(10));
		System.out.println("Find pattern starting at index 13: " + m.find(13));
		
	}
}
