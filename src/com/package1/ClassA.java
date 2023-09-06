package com.package1;

public class ClassA {
	public int data=10;
	public void display()
	{
		System.out.println("Data is :" +data);
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.display();
	}
}
