package com.java.tech.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>(Arrays.asList("I", "Am", "Subhadeep"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("I", "Am", "Kamalika"));

		// Using Naive approach
		/*
		 * ArrayList<String> list3 = new ArrayList<String>();
		 * 
		 * for (String temp : list1) {
		 * 
		 * if (list2.contains(temp)) {
		 * 
		 * list3.add(temp); } }
		 * 
		 * System.out.println("Common elements: " + list3);
		 */

		// Using list interface method

		/*
		 * list1.retainAll(list2); System.out.println(list1);
		 */

		/*
		 * ArrayList<String> list4 = new ArrayList<String>(list1);
		 * list4.retainAll(list2); // System.out.println(list4);
		 */
		
		//Using stream
		
		list1.stream().filter(list2::contains).forEach(x -> System.out.println(x));
	}

}
