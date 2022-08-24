package com.java.tech.solution;

public class RotaionCount {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5 };
		int arr2[] = {3, 4, 5, 1, 2 };
		int count = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr[0] == arr2[i]) {
				count = i;
				break;
			}
		}
		System.out.println("No of Swap :" + count);
	}

}
