package com.java.tech.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {

		List<Integer> listValues = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9, 1, 2, 0));
		int temp = 0;
		for (int i = 0; i < listValues.size(); i++) {

			for (int j = i; j < listValues.size(); j++) {

				if (listValues.get(i) > listValues.get(j)) {

					// Collections.swap(listValues, i, j);

					/*
					 * temp = listValues.get(j); listValues.set(j, listValues.get(i));
					 * listValues.set(i, temp);
					 */

					listValues.set(i, listValues.set(j, listValues.get(i)));

				}
			}
		}
		System.out.println(listValues);
	}
}
