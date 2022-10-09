package com.java.tech.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
		// Result.PrintFrequency(tokenList);
		//Result.PrintFrequency1(tokenList);
		Result.PrintFrequency2(tokenList);

	}

}

class Result {

	public static void PrintFrequency(List<String> tokenList) {
		int count = 0;
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (int i = 0; i < tokenList.size(); i++) {
			count = 1;
			for (int j = i + 1; j < tokenList.size(); j++) {
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

	public static void PrintFrequency1(List<String> tokenList) {

		tokenList.stream().collect(Collectors.groupingBy(x -> x, TreeMap::new, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public static void PrintFrequency2(List<String> tokenList) {

		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		for(String s : tokenList)
		treeMap.put(s, treeMap.getOrDefault(s, 0)+1);
		treeMap.forEach((v, k) -> System.out.println(v + " " + k));
	}
}
