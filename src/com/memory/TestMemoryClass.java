package com.memory;

public class TestMemoryClass {

	static int staticVar = 20;
	int instanceVar = 21;

	public static void main(String[] args) {

		//System.out.println(staticVar);
		//TestMemoryClass.printStatic();
		/*
		TestMemoryClass objref = new TestMemoryClass();
		objref.print();
		System.out.println(objref.instanceVar);
		System.out.println(objref.staticVar);
		*/
		TestMemoryClass objref=null;
		int i=1;
		while(true){
			objref = new TestMemoryClass();
			System.out.println("created object number: "+(i++));
		}
		
		//System.out.println("loop ended");
		
	}

	public void print() {
		System.out.println("Object printed... "+instanceVar);
	}

	public static void printStatic() {

		System.out.println("static printed...");

	}

}
