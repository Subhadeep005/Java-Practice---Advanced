package com.java.tech.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfStudentMarks {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(new Student(1, "Ankit", 75, "Developer"),
				new Student(2, "Rahul", 69, "Tester"), new Student(3, "Subha", 80, "Developer"),
				new Student(4, "Manisha", 90, "Analyst"));
		
		 Double avgMarks =studentList.stream().filter(x -> (x.getDepartment().equals("Developer"))).mapToDouble(m -> m.getMarks()).average().getAsDouble();
		 System.out.println("Average Marks of all developer : " + avgMarks);
	}

}
