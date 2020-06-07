package com.cognixia.jump.corejava.strings;

public class EditString {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		for(int i = 0; i < 5; i++) {
			str = str + i; // creating a new object each time
			System.out.println(str);
		}
		
		StringBuffer sbuff = new StringBuffer("Hello");
		for(int i = 0; i < 5; i++) {
			sbuff.append(i); // sticking with the same object, maintain one object
			System.out.println(sbuff);
		}	
		
		System.out.println("---------");
		
		StringBuilder sbuild = new StringBuilder("Hi");
		// append -> adding to the end
		sbuild.append(4.3);
		System.out.println(sbuild);
		
		// insert -> add to sequence at given index
		sbuild.insert(2, "Hello");
		System.out.println(sbuild);
		
		// delete -> removes part of string 
		sbuild.delete(1, 4);
		System.out.println(sbuild);
		
		// setCharAt -> replace characters at certain indexes
		sbuild.setCharAt(2,  '$');
		System.out.println(sbuild);
		
		// setLength -> resets the character length
		sbuild.setLength(4);
		System.out.println(sbuild);
		
		sbuild.setLength(0);
		System.out.println("sbuild = " + sbuild);
		
		sbuild.append(3.14);
		sbuild.append(false);
		sbuild.insert(3, '%');
		System.out.println(sbuild);
		
		// built in reverse method
		sbuild.reverse();
		System.out.println(sbuild);
		
		// convert to String 
		String myStr = sbuild.toString();
		
		System.out.println(myStr);
		
		
		String myStr2 = "Java";
		
		StringBuilder sb = new StringBuilder(myStr2);
		StringBuilder sb2 = new StringBuilder();
	}

}
