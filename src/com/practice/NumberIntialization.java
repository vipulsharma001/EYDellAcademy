package com.practice;

public class NumberIntialization {
	int n1;
	static int n2;
	static {
		System.out.println("Static Intitilizor Block ");

	}

	NumberIntialization() {
		n1 = 70;
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(n2);
		NumberIntialization obj = new NumberIntialization();
		System.out.println(obj.n1);
	}
}
