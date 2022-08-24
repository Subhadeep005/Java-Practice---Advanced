package com.java.tech.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) {

		List<String> tokenList = new ArrayList<String>();
		tokenList.add("dogs");
		tokenList.add("cats");
		tokenList.add("horses");
		tokenList.add("bee");
		tokenList.add("cats");
		tokenList.add("dogs");
		tokenList.add("cat");
		tokenList.add("ant");
		tokenList.add("bee");

		// tokenList.forEach(System.out::println);
		// tokenList.stream().filter(p ->
		// p.startsWith("c")).forEach(System.out::println);
		Result.PrintFrequency(tokenList);

	}

}

class Result {

	public static void PrintFrequency(List<String> tokenList) {
		int count = 0;
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (int i = 0; i < tokenList.size(); i++) {
			count = 1;
			for (int j = i+1; j < tokenList.size(); j++) {
				if (tokenList.get(i).equals(tokenList.get(j))) {
					count++;
					tokenList.remove(j);
				}
			}
			map.put(tokenList.get(i), count);
			/*
			 * Collections.sort(tokenList, (o1,o2) -> o1.compareTo(o2));
			 * System.out.println(tokenList.get(i)+" "+count);
			 */
		}
		map.forEach((v, k) -> System.out.println(v + " " + k));
	}
}
