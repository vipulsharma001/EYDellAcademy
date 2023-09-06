package com.genricsexplained;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("draw Rectangle");
	}
}

class Square extends Shape
{	@Override
	void draw()
	{
		System.out.println("draw Rectangle");
	}
}

class Circle extends Shape
{	@Override
	void draw()
	{
		System.out.println("draw Circle");
	}
}

public class UpeerBoundWIldCard {
	public static void main(String[] args) {
		List<Rectangle> listRect = new ArrayList<>();
		listRect.add(new Rectangle());
		listRect.add(new Rectangle());
		
		List<Circle> listCirc = new ArrayList<>();
		listCirc.add(new Circle());
		
		
		drawShape(listRect);drawShape(listCirc);
	}
	static void drawShape(List<? extends Shape> List)
	{
		for(Shape s : List)
		{
			s.draw();
		}
	}

}
