package com.java.tech.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(21, 22, 23, 24, 33, 31, 32, 41, 43, 45, 46, 55, 56);

		// Collections.sort(list);

		list.sort((o1, o2) -> Integer.compare(o1, o2));
		list.forEach(System.out::println);

		System.out.println("reverse direction");

		Collections.reverse(list);
		list.forEach(System.out::println);

		/*
		 * System.out.println("Reverse Direction"); List<Integer> list2=
		 * list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 * list2.forEach(System.out::println);
		 */

		// list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("data between 12 to 64");
		list.stream().filter(x -> x > 12 && x < 64).collect(Collectors.toList()).forEach(System.out::println);

	}

}
