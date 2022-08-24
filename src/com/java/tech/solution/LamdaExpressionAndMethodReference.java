package com.java.tech.solution;

public class LamdaExpressionAndMethodReference {

	public static void main(String[] args) {

		Functionalinterface Functionalinterface1 = MethodReference::display;
		System.out.println(Functionalinterface1.find());

		Functionalinterface Functionalinterface2 = () -> "Hi From Lamda Expression";
		System.out.println(Functionalinterface2.find());

		Functionalinterface1 Functionalinterface3 = () -> System.out.println("Hi From Functionalinterface3");
		Functionalinterface3.find();
	}

}

class MethodReference {

	public static String display() {

		return "Hi From Method Reference";

	}

}

@FunctionalInterface
interface Functionalinterface {
	public String find();
}

@FunctionalInterface
interface Functionalinterface1 {
	public void find();
}
