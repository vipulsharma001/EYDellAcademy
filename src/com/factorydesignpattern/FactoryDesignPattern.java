package com.factorydesignpattern;

interface Shape
{
	public void draw();
	
}

class Rectangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Rectangle Class");
	}
}
class Square implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square Class");
	}
}
class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle Class");
	}
}

class ShapeFactory
{
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		else if(shapeType.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle"))
		{
			return new  Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		Shape shape1 = shapefactory.getShape("Circle");
		shape1.draw();
		try {
			Shape shape2 = shapefactory.getShape("Rectangle");
			shape2.draw();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null Object came for class");
		}
		
		Shape shape3 = shapefactory.getShape("Square");
		shape3.draw();
	}
}
