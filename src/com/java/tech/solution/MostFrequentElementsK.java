package com.java.tech.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MostFrequentElementsK {

	public static int[] topKFrequent(int[] nums, int k) {

		if (nums.length == k) {
			return nums;
		}

		Map<Integer, Integer> count = new HashMap<>();
		for (int n : nums) {
			count.put(n, count.getOrDefault(n, 0) + 1);
		}

		// count.forEach((key,value) -> System.out.println(key +"->"+ value));

		Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> Integer.compare(count.get(n1), count.get(n2)));

		for (int n : count.keySet()) {
			heap.add(n);
			if (heap.size() > k)
				heap.poll();
		}
		// heap.forEach(System.out::println);

		int top[] = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			top[i] = heap.poll();
		}

		return top;
	}

	public static void main(String[] args) {
		int[] input = { 1, 1, 1, 1, 1, 4, 4, 4, 4, 2, 2, 2, 2, 3, 3, 3, 5, 5, 5, 5, 5 }; int k=3;
		System.out.println("The MostFrequentElements is : " + Arrays.toString(topKFrequent(input, k)));
	}

}
