package com.java.tech.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student(1, "Ankit", 75, "Developer"),
				new Student(2, "Rahul", 69, "Tester"), new Student(3, "Subha", 80, "Developer"),
				new Student(4, "Manisha", 90, "Analyst"));
		// Sorting by name
		studentList.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		// Sorting by Marks
		Collections.sort(studentList, (o1, o2) -> Integer.compare(o1.getMarks(), o2.getMarks()));
		studentList.forEach(p -> System.out.println(p));

		List<Student> newList = new ArrayList<Student>();

		// Prints Marks greater than 80
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getMarks() > 80) {
				newList.add(studentList.get(i));
			}
		}
		// newList.forEach(System.out::println);

		// Prints Marks greater than 80
		// studentList.stream().filter(x -> x.getMarks() > 80).forEach(y ->
		// System.out.println(y));

		studentList.stream().filter(x -> x.getMarks() > 80).collect(Collectors.toList());
		// Group by departments
		Map<String, List<Student>> map = studentList.stream().collect(Collectors.groupingBy(p -> p.getDepartment()));
		map.forEach((k, v) -> System.out.println("Group by departments : "+k + "," + v));
		//studentList.stream().collect(Collectors.groupingBy(p -> p.getDepartment())).forEach((k, v) -> System.out.println(k + "," + v));

		// System.out.println(studentList.stream().collect(Collectors.groupingBy(p ->
		// p.getDepertment())));
		
		//Average marks of Developer department
		
		OptionalDouble optionalDouble = studentList.stream().filter(x -> (x.getDepartment().equals("Developer"))).mapToDouble(s -> s.getMarks()).average();
		System.out.println("Average Marks:"+optionalDouble.getAsDouble());
	}

}
