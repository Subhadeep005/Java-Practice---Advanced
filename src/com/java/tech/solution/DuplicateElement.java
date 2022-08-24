package com.java.tech.solution;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("A", "B", "C", "D", "A", "D", "C", "X");

		System.out.println("Duplicate Elements of Stream are : " + FindDuplicateElement.findDuplicateElements(stream));
	}

}

class FindDuplicateElement {

	public static Set<String> findDuplicateElements(Stream<String> stream) {

		Set<String> items = new HashSet<String>();

		return stream.filter(x -> !items.add(x)).collect(Collectors.toSet());
	}

}