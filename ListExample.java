package com.cognixia.jump.corejava.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.corejava.compositionandinheritance.Bike;

public class ListExample {

	public static void main(String[] args) {

		List<String> fruitList = new ArrayList<>();
		
		// add() -> adds new element to list, appends to the end
		fruitList.add("apple");
		fruitList.add("strawberry");
		
		System.out.println("fruit list = " + fruitList);
		
		System.out.println("\nFruit List:");
		for(String fruit : fruitList) {
			System.out.println(fruit);
		}
		
		System.out.println("\nFruit List:");
		for(int i = 0; i< fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		fruitList.remove(0);
		System.out.println("\nfruits = " + fruitList);
		System.out.println("At index 3: " + fruitList.get(0));
		
		fruitList.remove("strawberry");
		System.out.println("\nfruits = " + fruitList);
		
		List<Bike> temp = new ArrayList<>();
		
		Bike b = new Bike("bike");
		temp.add(b);
		temp.add(new Bike("red"));
		temp.add(new Bike("blue"));
		
		System.out.println(temp);
		for(Bike bike : temp) {
			System.out.println(bike);
		}
		
		temp.remove(b);
		System.out.println("After:");
		for(Bike bike : temp) {
			System.out.println(bike);
		}

		
	}

	@Override
	public String toString() {
		return "ListExample []";
	}

}
