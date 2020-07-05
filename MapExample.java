package com.cognixia.jump.corejava.collectionsandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<>();
		Map<Integer, String> hashMap = new HashMap<>();
		
		String[] names = { "Sam", "Tom", "Tim", "Mary", "Sarah"};
		
		for(int id = 1; id <= names.length; id++) {
			treeMap.put(id, names[id - 1]);
			hashMap.put(id, names[id - 1]);

		}
		
		System.out.println("tree = " + treeMap);
		System.out.println("hash = " + hashMap);
		
//		Map<String, String> temp = new HashMap<>();
//		temp.put("hello1", "");
//		temp.put("hello10", "");
//		temp.put("hello12", "");
//		temp.put("hello21", "");
//		temp.put("hello100", "");
//		
//		System.out.println(temp);
		
		System.out.println(treeMap.get(5));
		System.out.println(treeMap.get(10));
		
		
		// iterate through a map 
		// Entry -> object storing the key and value pair
		// entrySet() -> returns the map as a Set of Entries
		// getKey() -> for Entry, get key
		// getValue() -> for Entry, get value
		
		// for each Entry in the Set
		for( Map.Entry<Integer, String> person : treeMap.entrySet() ) {
			
			System.out.println("key = " + person.getKey() + ", value = " + person.getValue());
			
			if(person.getKey() == 2) {
				person.setValue("Hello");
			}
		}
		
		System.out.println(treeMap);
		
		Set<Integer> keys = treeMap.keySet();
		
		System.out.println("keys = " + keys);
		
		treeMap.remove(4);
		System.out.println(treeMap);
		
		treeMap.put(1, "World"); // add in new entries, update values if key already exists
		System.out.println(treeMap);
		
		
		System.out.println("size = " + treeMap.size() );
		
		treeMap.clear();
		treeMap.isEmpty();
		
		hashMap.put(null, "HI");
		hashMap.put(null, "HI2");
		hashMap.put(1, "HI");
		System.out.println(hashMap);
		
		
	}

}
