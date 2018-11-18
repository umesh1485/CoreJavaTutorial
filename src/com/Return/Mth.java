package com.Return;
class Mth {
	public static void main(String[] args) {
		int result = process(10, 20);
		System.out.println("answer is = " + result);

		int result2 = process2(10, 20);
		System.out.println("answer is = " + result);

		int result3 = process3(10, 20);
		System.out.println("answer is = " + result);

		int result4 = process4(10, 20);
		System.out.println("answer is = " + result);
	}



	public static int process(int a, int b) {
		int d = a + b;
		return d;
	}

	public static int process2(int a, int b) {
		int d = a - b;
		return d;
	}

	public static int process3(int a, int b) {
		int d = a / b;
		return d;
	}

	public static int process4(int a, int b) {
		int d = a * b;
		return d;
	}
}
