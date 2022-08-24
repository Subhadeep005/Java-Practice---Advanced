package com.java.tech.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int arr[] = { 4, 7, 8, 10, 45, 36, 1, 5, 3 };

		// Find Second Element
		// System.out.println(findSecondHighset(arr));

		List<Integer> list = Arrays.asList(1, 6, 4, 9, 3);

		// Find Second Highest Element
		int i = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().orElse(0);
		// System.out.println(i);

		// Find Second Highest Element
		int j = list.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		// System.out.println(j);

		// Find Second Highest Element
		int k = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		// System.out.println(k);

		// Find Second Highest Element

		int integer1 = list.stream().max((x, y) -> x.compareTo(y)).get();
		// System.out.println(integer1);
		Integer integer2 = list.stream().filter(x -> x < integer1).max((x, y) -> x.compareTo(y)).get();
		// System.out.println(integer2);

		// Reverse Order
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// list2.forEach(System.out::println);

		list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		// Printing list after sorting
		//list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

	}

	public static int findSecondHighset(int arr[]) {
		Arrays.sort(arr);

		return (arr[arr.length - 2]);
	}

}