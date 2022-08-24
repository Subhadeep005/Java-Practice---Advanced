package com.java.tech.solution;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfListElement {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(2, 3, 3, 4, 6, 8, 8);

		OptionalDouble obj = intStream.average();

		if (obj.isPresent()) {
			System.out.println(obj.getAsDouble());
		} else {
			System.out.println("-1");
		}
	}

}
