package com.java.tech.string.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		// Creating empty priority queue
		Queue<Integer> pQueue = new PriorityQueue<>((n1,n2) -> n2.compareTo(n1));

		// Adding items to the pQueue
		// using add()
		pQueue.add(50);
		pQueue.add(1);
		pQueue.add(23);
		pQueue.add(44);
		pQueue.add(38);

		pQueue.forEach(System.out::println);
		// Printing the top element of
		// the PriorityQueue
		/*
		 * System.out.println(pQueue.peek());
		 * 
		 * // Printing the top element and removing it // from the PriorityQueue
		 * container System.out.println(pQueue.poll());
		 * 
		 * // Printing the top element again System.out.println(pQueue.peek());
		 */

	}

}
