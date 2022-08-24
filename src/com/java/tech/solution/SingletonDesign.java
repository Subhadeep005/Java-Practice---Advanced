package com.java.tech.solution;

public class SingletonDesign {

	private SingletonDesign() {
	}

	private final static SingletonDesign instance = new SingletonDesign();

	public static SingletonDesign getInstance() {

		return instance;
	}
}
