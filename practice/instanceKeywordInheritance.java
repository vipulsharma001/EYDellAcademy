package com.practice;

interface ABC{}

class Parent17 implements ABC{}
class Child1 extends Parent17{}
class Child2 extends Parent17{}
public class instanceKeywordInheritance {

	public static void main(String[] args)
	{
		Parent17 P = new Parent17();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		System.out.println(P instanceof Parent17);
		System.out.println(c1 instanceof Child1);
		System.out.println(c2 instanceof Child2);
		
		System.out.println(c2 instanceof Parent17);
//Error Code
//		System.out.println(c2 instanceof Child1);
//		System.out.println(c1 instanceof Child2);
		
		
		System.out.println(c1 instanceof ABC);
	}
}
