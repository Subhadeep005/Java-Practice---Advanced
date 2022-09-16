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
		
		int max3= list.stream().sorted((x,y) -> y.compareTo(x)).findFirst().get();
		System.out.println("Max3 ->"+max3);
		int min3= list.stream().sorted((x,y) -> x.compareTo(y)).findFirst().get();
		System.out.println("Min3 ->"+min3);
		
		int max4= list.stream().sorted((x,y) -> Integer.compare(y, x)).findFirst().get();
		System.out.println("Max4 ->"+max4);
		int min4= list.stream().sorted((x,y) -> Integer.compare(x, y)).findFirst().get();
		System.out.println("Min4 ->"+min4);
	}

}
