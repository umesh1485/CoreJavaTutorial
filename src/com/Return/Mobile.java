package com.Return;

public class Mobile {

	public static void main(String[] args) {

		/*
		 * boolean dialed = dialNumber(971120);
		 * System.out.println("Number is dialed: "+dialed); dialed =
		 * dialNumber(0); System.out.println("Number is dialed: "+dialed);
		 */

		// String valueOfGethello = getHello("Rahul");
		// System.out.println("\n\n\n\n " + valueOfGethello);

		int abc = addme(12, 23);

		System.out.println("sum is : " + abc);
		int abc2 = addme(1, 1);

		System.out.println("sum is : " + abc2);
	}

	public static boolean dialNumber(int number) {
		System.out.println("Entered in dial function");
		if (number > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static String getHello(String name) {

		String abc = "Hello " + name;
		return abc;

	}

	public static int addme(int a, int b) {

		int c = a + b;
		return c;
	}

}

