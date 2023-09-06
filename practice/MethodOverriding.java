package com.practice;
class Parent2
{	int d=10;
	void say()
	{
		System.out.println("Parent Class");
	}
}
public class MethodOverriding extends Parent2{
	int d=20;
	void say()
	{
		System.out.println("Child Class");
	}
	
	void display()
	{
		this.say();
		System.out.println(this.d);
		
		super.say();
		System.out.println(super.d);
	}
 public static void main(String[] args) {
	Parent2 obj = new Parent2();
	obj.say();
	System.out.println(obj.d);
	
	
	MethodOverriding m = new MethodOverriding();
	m.say();
	System.out.println(m.d);
	
	m.display();
	
	
}
}
