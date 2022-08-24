package com.java.tech.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLoewstElements {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40 };

		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		//Arrays.stream(arr).forEach(x-> System.out.println(x));

		// System.out.println("Heghest Number :" + max);
		// System.out.println("Lowest Number :" + min);

		List<Integer> list = Arrays.asList(1, 6, 4, 9, 3);
		// Collections.sort(list);
		// list.forEach(System.out::println);

		// list.sort((o1,o2) -> Integer.compare(o1, o2));
		//list.sort((o1,o2) -> o1.compareTo(o2));
		// list.forEach(x -> System.out.println(x));
		
		//Printing list after sorting
		//list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		int max1 = Collections.max(list);
		int min1 = Collections.min(list);
		// System.out.println(max1);
		// System.out.println(min1);

		int max2 = list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(max2);
		int min2 = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(min2);
	}

}
