package com.absontheweb.springcore.beans;
 
public class Counter {
	
	private int value;
	
	public Counter() {}
	
	public Counter(int value) {
		super();
		this.value = value;
	}

	public int get() {
		return this.value;
	}
	
	public Counter plusOne(){
		this.value++;
		return this;
	}
	
	public Counter minusOne(){
		this.value--;
		return this;
	}

}
