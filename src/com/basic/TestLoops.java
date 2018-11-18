package com.basic;

public class TestLoops {

	public static void main(String[] args) {
		int k = 0;
		String s = "";
		// for loop, 3 block
		/*
		 * for(int i=0;TestLoops.m1(i); i++ ){
		 * 
		 * if(i==3){ break; }
		 * 
		 * System.out.println(i); }
		 */
		String arr[] = { "sss", "fff", "eee", "rrr" };

		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		for(int i=0; i<arr.length; i++){
			System.out.println("iteration :"+arr[i]);
		}
		/*for (int i : arr) {
			System.out.println(i);
		}*/

		// System.out.println(TestLoops.m1(2));

	}

	static boolean m1(int i) {

		// System.out.println(i<5);
		return i < 5;
	}

}
