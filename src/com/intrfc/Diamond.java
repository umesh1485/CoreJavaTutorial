package com.intrfc;

public class Diamond implements A,B{

	@Override
	public void print() {
		System.out.println("This is common print");
		
	}
	
	public void methodOfDiamond(){
		System.out.println("Diamond Method");
	}

	@Override
	public void methodOfB() {
		System.out.println("B Method");
		
	}

	@Override
	public void methodOfA1() {
		System.out.println("A Method");
		
	}

	

	

	

	

}
