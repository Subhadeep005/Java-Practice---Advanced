package com.java.tech.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find {

	public static void main(String[] args) {
		List<Integer> listItem = new ArrayList<Integer>();
		listItem.add(1);
		listItem.add(12);
		listItem.add(23);
		listItem.add(1);
		listItem.add(35);
		listItem.add(1);
		listItem.add(45);
		listItem.add(56);
		listItem.add(1);

		for (int i = 0; i < listItem.size(); i++) {

			if (listItem.get(i) == 1) {

				listItem.add(listItem.get(i));
				listItem.remove(i);
			}

		}
		listItem.forEach(System.out::println);
	}

}
