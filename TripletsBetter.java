package com.cognixia.jump.corejava.collectionsandgenerics;

public class TripletsBetter<T> implements Triplet<T> {
	
	private T youngest;
	private T middle;
	private T oldest;
	
	@Override
	public boolean add(T child) {
		
		if(oldest == null) {
			oldest = child;
			return true;
		}
		else if ( middle == null ) {
			middle = child;
			return true;
		}
		else if ( youngest == null ) {
			youngest = child;
			return true;
		}
		else {
		return false;
		}
	}
	
	@Override
	public T get(int child) {
		
		if(child % 3 == 0) {
			return youngest;
		}
		else if(child % 2 == 0) {
			return middle;
		}
		else {
			return oldest;
		}
	}
	
	@Override
	public String toString() {
		return "TripletImpl [youngest=" + youngest + ", middle=" + middle + ", oldest=" + oldest + "]";
	}
}
