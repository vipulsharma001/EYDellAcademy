package com.practice;

class Parent
{
	String name;
	void say()
	{
		System.out.println("In the Parent Class");
	}
}

class Child extends Parent
{
	void say()
	{
		System.out.println("In the Child Class");
	}
}
public class DowncastingInJava {
	//In downcasting we create object of child class and the reference is of Parent Class
	Parent p = new Child();
	Child c=(Child)p;
	c.say();
}
