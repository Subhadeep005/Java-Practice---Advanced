package com.java.tech.solution;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementsK {
	
	public static int[] topKFrequent(int[] nums, int k) {
		
		if(nums.length == k) {
			return nums;
		}
		
		Map<Integer, Integer> count = new HashMap();
		for(int n : nums) {
		count.put(n, count.getOrDefault(count, null));
		}
		
		return nums;
	}

}
