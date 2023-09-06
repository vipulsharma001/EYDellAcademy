package com.practice;

public class EqualsMethod {
 public static void main(String[] args) {
	String str1 = "String is immutable class";
	String str2 = "String is immutable class";
	if(str1==str2)
	{
		System.out.println("== works for literals and constants");
	}
	else {
		System.out.println("== does not works for literals and constants");
	}
	//Objects
	String str3= new String("String is immutable class");
	String str4= new String("String is immutable class");
	
	if(str3==str4)
	{
		System.out.println("== works for literals and constants");
	}
	else {
		System.out.println("== does not works for literals and constants");
	}
	if(str3.equals(str4))
	{
		System.out.println("equals method works for OBJETCS!!");
	}
	else {
		System.out.println("equals method does not works for OBJETCS!!");
	}
	System.out.println("Memory Address is : "+ str3.hashCode());
	System.out.println("Memory Address is : "+ str4.hashCode());
 }
}
