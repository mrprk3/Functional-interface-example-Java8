package com.example.java8;

@FunctionalInterface
interface FunctionalEx {
	void add();

	default void add2() {
		System.out.println("This is add2() method");
	}

	static void add3() {
		System.out.println("This is add3() method");

	}
}

public class Test {

	FunctionalEx functionalEx = () -> {
		System.out.println("This is add1() method");
	};
	
	public static void main (String [] args) {
		Test t = new Test();
		t.functionalEx.add();
		FunctionalEx.add3();
	}

}
