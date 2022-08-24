package com.java.tech.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OddAndEvenUsingJava8 {

	public static void main(String[] args) {

		List<Integer> listItem = new LinkedList<Integer>();
		listItem.add(1);
		listItem.add(2);
		listItem.add(3);
		listItem.add(4);
		listItem.add(5);
		listItem.add(6);

		// List<Integer> listItem = Arrays.asList(1,2,3,4,5,6);

		/*
		 * listItem.stream().filter(x -> x % 2 == 0).map(i -> i +
		 * "e").forEach(System.out::println); listItem.stream().filter(x -> x % 2 !=
		 * 0).map(i -> i + "o").forEach(System.out::println);
		 */

		listItem.stream().forEach(x -> {
			if (x % 2 == 0) {
				System.out.println(x + "e");
			} else
				System.out.println(x + "o");
		});

	}

}
