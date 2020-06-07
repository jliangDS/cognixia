package com.cognixia.jump.corejava.collectionsandgenerics;

public class TripletImpl<T> implements Triplet<T>{
	
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
		
		if(child == 1) {
			return oldest;
		}
		else if(child == 2) {
			return middle;
		}
		else if(child == 3) {
			return youngest;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "TripletImpl [youngest=" + youngest + ", middle=" + middle + ", oldest=" + oldest + "]";
	}
}
