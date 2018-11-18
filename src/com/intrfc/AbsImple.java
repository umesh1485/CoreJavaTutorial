package com.intrfc;

public class AbsImple extends Abs{

	static String a;
	static String b;
	public AbsImple() {
		super(a,b);	
	}
	public AbsImple(String a, String b) {
		super(a,b);
		
	}

	@Override
	void declare() {
		System.out.println("declare in Impl");
		
	}

}
