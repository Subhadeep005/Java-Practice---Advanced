package com.java.tech.string.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindNoOfOccuranceOfElements {

	public static void main(String[] args) {

		String str = "Automation Engine";
		HowManyElementsInString.elementCount(str);
		HowManyElementsInString.elementCount1(str);
		HowManyElementsInString.elementCount2(str);
		HowManyElementsInString.elementCount3(str);
	}
}

class HowManyElementsInString {

	public static void elementCount(String str) {
		Arrays.asList(str).forEach(i -> System.out.println(i));
		char[] arr = str.toCharArray();
		for (int j = 0; j < arr.length; j++) {
			int count = 1;
			if (arr[j] != ' ') {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] == arr[k]) {
						count++;
						arr[k] = ' ';
					}
				}
			}
			if (arr[j] != ' ')
				System.out.println(arr[j] + "->" + count);
		}
	}

	public static void elementCount1(String str) {
		Arrays.asList(str).forEach(i -> System.out.println(i));
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (charCount.containsKey(str.charAt(i))) {
				if (str.charAt(i) != ' ') {
					int count = charCount.get(str.charAt(i));
					charCount.put(str.charAt(i), ++count);
				}
			} else if (str.charAt(i) != ' ') {
				charCount.put(str.charAt(i), 1);
			}
		}
		charCount.forEach((x, y) -> System.out.println(x + "->" + y));
	}

	public static void elementCount2(String str) {

		Arrays.asList(str).forEach(i -> System.out.println(i));
		Map<String, Long> result = Arrays.stream(str.split("")).filter(x -> !(x.equalsIgnoreCase(" ")))
				.collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));
		result.forEach((k, v) -> System.out.println(k + "->" + v));
	}

	public static void elementCount3(String str) {

		Arrays.asList(str).forEach(i -> System.out.println(i));
		char arr[] = str.toCharArray();
		Map<Character, Integer> result = new HashMap<>();
		for (char c : arr) {
			if (c != ' ')
				result.put(c, result.getOrDefault(c, 0) + 1);
		}
		result.forEach((k, v) -> System.out.println(k + "->" + v));
	}

	/*
	 * public static void elementCount4(String str) {
	 * 
	 * Arrays.asList(str).forEach(i -> System.out.println(i));
	 * Pattern.compile(".").matcher(str).results().map(m -> m.group().toLowerCase())
	 * .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,
	 * Collectors.counting())) .forEach((x, y) -> System.out.println(x + "->" + y));
	 * 
	 * }
	 */
}
