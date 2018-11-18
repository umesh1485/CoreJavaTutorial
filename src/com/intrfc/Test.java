package com.intrfc;

public class Test {

	public static void main(String[] args) {
		
		
		/*MyInterfaceImpl obj1 = new MyInterfaceImpl();
		
		obj1.printName();
		obj1.printage();
		obj1.job();*/
		
		/*MyInteface obj1 = new MyInterfaceImpl();
		
		obj1.printName();
		obj1.printage();
		obj1.job();*/
		
		
		//Diamond problem
		/*A a = new Diamond();
		B b=new Diamond();
		Diamond diamond=new Diamond();
		
		a.print();
		a.methodOfA1();
		
		b.print();
		b.methodOfB();
		
		diamond.print();
		diamond.methodOfDiamond();*/
		
		//Abstract
		Abs abs = new AbsImple();
		abs.declare();
		abs.define();

	}

}
