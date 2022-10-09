package com.java.tech.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BiggestElimentInList {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "pie", "pineapple", "apricots", "pie");

		for (int i = 0; i < fruits.size(); i++) {
			for (int j = i; j < fruits.size(); j++) {
				if (fruits.get(i).length() > fruits.get(j).length()) {
					Collections.swap(fruits, i, j);
				}
			}
		}
		System.out.println(fruits.get(fruits.size() - 1));

		String str = fruits.stream().sorted((o1, o2) -> Integer.compare(o2.length(), o1.length())).findFirst().get();

		System.out.println(str);

		String str1 = fruits.stream().max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get();
		System.out.println(str1);

		String str2 = fruits.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(str2);

		String str3 = fruits.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(str3);

	}

}
