package com.interfaceExplained;

import java.util.*;
import com.practice.override;

abstract class Shape{
	// Unique Functionality -define
	abstract void draw();//declaration , abstract method can only be used in abstract class
	 int area,length,bredth,radius;
	 double areaofcircle;
	void purpose()
	{
		System.out.println("Calculate the area of  Shape:");
	}
}
class Triangle extends Shape{
	@override
	void draw()
	{
		int length=20,bredth=10;
		area= (length*bredth)/2;
		purpose();
		System.out.println("Area of triangle is :"+ area);
	}
}
class Rectangle extends Shape{
	@override
	void draw()
	{
		int length=20,bredth=10;
		area= length*bredth;
		purpose();
		System.out.println("Area of Rectangle is :"+ area);
	}
}
class Circle extends Shape{
	@override
	void draw()
	{
		int radius=10;
		areaofcircle= Math.PI*radius*radius;
		purpose();
		System.out.println("Area of Circle is :"+ areaofcircle);
	}
}
public class LetsUnderstandAbstraction {
	public static void main(String[] args) {
		Triangle tr= new Triangle();
		tr.draw();
		Circle Cr= new Circle();
		Cr.draw();
		Rectangle Rr= new Rectangle();
		Rr.draw();
	}
}
