package com.java.tech.solution;

public class Student {

	int id;
	String name;
	int marks;
	String department;

	Student(int id, String name, int marks, String department) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.department = department;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", department=" + department + "]";
	}

}