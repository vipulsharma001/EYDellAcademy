package com.practice;

public class WrapperClasses {
	public static void main(String[] args) {
		//Data Types
		byte grade =2;
		short marks = 20;
		float price = (float) 8.3;
		double rate=240.3;
		int x=69;
		boolean r = false;
		char ini='S';
		
		//Auto-Boxing - To get object out from a Data type (Wrapper Class)
		Byte bobject= new Byte(grade);
		Short sobject = new Short(marks);
		System.out.println(bobject);
		System.out.println(grade);
		
		//UnBoxing
		byte byteValue = bobject.byteValue();
		System.out.println(byteValue);
		
	}
}
