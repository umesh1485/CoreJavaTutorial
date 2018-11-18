package com.collction;

public class TestArr {

	public static void main(String args[]) {

		int arr[] = { 22, 11, 33, 55 };
		System.out.println("Array values before modification: int arr[] = { 22, 11, 33, 55 }");
		for (int k = 0; k < arr.length; k++) {
			System.out.println("Index :" + k + "  value: " + arr[k]);
		}
		int modifiedArr[] = modifyArray(arr, 2, 444);

		System.out.println("Array values after modification: modifyArray(arr, 2, 444)");
		for (int k = 0; k < modifiedArr.length; k++) {

			System.out.println("Index :" + k + "  value: " + arr[k]);
		}

		int pushedArr[] = pushToArray(arr, 2, 555);

		System.out.println("Array values after push: pushToArray(arr, 2, 555)");
		for (int k = 0; k < pushedArr.length; k++) {

			System.out.println("Index :" + k + "  value: " + pushedArr[k]);
		}
		
		int removedFromArr[] = removeFromArray(pushedArr, 2);

		System.out.println("Array values after remove: removeFromArray(pushedArr, 2)");
		for (int k = 0; k < removedFromArr.length; k++) {

			System.out.println("Index :" + k + "  value: " + removedFromArr[k]);
		}

	}

	static int[] modifyArray(int arr[], int index, int value) {
		arr[index] = value;
		return arr;
	}

	static int[] pushToArray(int arr[], int index, int value) {
		int newArr[] = new int[arr.length + 1];
		int indexCount = 0;
		for (int k = 0; k < newArr.length; k++) {
			if (k == index) {
				newArr[k] = value;
			} else {
				newArr[k] = arr[indexCount];
				indexCount++;
			}
			
		}
		return newArr;
	}
	
	static int[] removeFromArray(int arr[], int index) {
		int newArr[] = new int[arr.length - 1];
		int indexCount = 0;
		for (int k = 0; k < arr.length; k++) {
			if (k != index) {
				newArr[indexCount] = arr[k];
				indexCount++;
			}
		}
		return newArr;
	}
}
