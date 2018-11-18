package com.intrfc;

public abstract class Abs {

	public Abs(String a, String b){}
	
	abstract void declare();
	
	void define(){
		System.out.println("define in Abs.............");
	}
}
