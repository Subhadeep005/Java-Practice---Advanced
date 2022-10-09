package com.java.tech.solution;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseListUsingStreamWithoutSorting {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(11, 22, 33, 44);

		/*
		 * List<Integer> list = new ArrayList<Integer>(); for (int i = lists.size() - 1;
		 * i >= 0; i--) { list.add(lists.get(i)); } list.forEach(System.out::println);
		 */

		/*
		 * lists.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list
		 * -> { Collections.reverse(list); return list.stream();
		 * })).forEach(System.out::println);
		 */

		 lists.stream().collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(System.out::println);

		/*
		 * lists.stream().collect( Collector.of( () -> new ArrayDeque(),
		 * ArrayDeque::addFirst, (a, b) -> { b.addAll(a); return b;
		 * })).stream().forEach(System.out::println);
		 */

	}

}
