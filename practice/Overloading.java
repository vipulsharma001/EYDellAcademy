package com.practice;

public class Overloading {
	int add (int x, int y)
	{
		return x+y;
	}
	int add (int x, int y,int z)
	{
		return x+y+z;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		Overloading l = new Overloading();
		System.out.println(l.add(2,3));
		System.out.println(l.add(2,3,6));
		System.out.println(l.add(2.3,3.7));
	}
}
