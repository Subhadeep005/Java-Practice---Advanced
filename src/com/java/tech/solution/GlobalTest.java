package com.java.tech.solution;

public class GlobalTest {

	public static void main(String[] args) {
		
		A a = new B();
		a.walk();
	}

}


class A{

public void walk(){
run();
}
public void run()
{
System.out.println("Class A run");
}
}

class B extends A
{
public void run()
{
System.out.println("Class B run");
}
}