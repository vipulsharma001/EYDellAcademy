package com.practice;

public class constructors {
	int n;
	constructors()
	{n=100;}
	constructors(int n)
	{this.n=n;}
	
	public static void main(String[] args) {
		constructors obj=new constructors();
		System.out.println("Default Constructors:"+obj.n);
		constructors obj2=new constructors(1000);
		System.out.println("Paramaterized Constructors:"+obj2.n);
	}
}
