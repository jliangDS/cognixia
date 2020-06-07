package com.cognixia.jump.corejava.compositionandinheritance;

import java.util.ArrayList;

class Book {
	
	public void whatAmI() {
		System.out.println("I am a book");
	}
	
	public final void turnPage() { // final -> can't override
		System.out.println("Turning page in book");
	}
	
	public static void hello() {
		System.out.println("Hello from book");
	}
}

class Textbook extends Book {
	
	public void whatAmI() {
		System.out.println("I am a textbook");
	}
	
// public void turnPage() {
// 
// }
	
	public static void hello() { // you can not override a static method
		System.out.println("Hello from textbook");
	}


}

public class PolymorphismExamples {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.whatAmI();
		
		Textbook textbook = new Textbook();
		textbook.whatAmI();
		
		Book book2 = new Textbook();
//		Textbook textbook2 = new Book();
		book2.whatAmI();
		
		Book[] library = new Book[5];
		
		library[0] = new Book();
		library[1] = new Textbook();
		
		ArrayList<Book> library2 = new ArrayList<>();
		
		library2.add(new Textbook());
		
		
		
		Book.hello();
		Textbook.hello();
	}
}
