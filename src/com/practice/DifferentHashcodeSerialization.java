package com.practice;

public class DifferentHashcodeSerialization {
	public static void main(String[] args) {
		DifferentHashcodeSerialization o1 = new DifferentHashcodeSerialization();
		System.out.println(o1.hashCode());
		DifferentHashcodeSerialization o2 = new DifferentHashcodeSerialization();
		System.out.println(o2.hashCode());
	}
}
