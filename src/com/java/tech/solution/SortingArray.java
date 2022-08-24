package com.java.tech.solution;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 3, 9, 4, 1, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
