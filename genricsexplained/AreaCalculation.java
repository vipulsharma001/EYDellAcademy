package com.genricsexplained;


@FunctionalInterface
interface Circle2
{
	double get(double radius);
}
public class AreaCalculation {
	public static void main(String[] args) {
		Circle2 circleRadius =(r)->Math.PI*r*r ;
		Circle2 circleCircumfrence =(r)->Math.PI*r*2 ;
		
		AreaCalculation obj =new AreaCalculation();
		
		double area = obj.circleOperation(10,circleRadius);
		double circumfrence = obj.circleOperation(20,circleCircumfrence);
		
		System.out.println("Area of circle is : "+ area +" \nCircumfrence is "+ circumfrence);
	}
	
	public double circleOperation(double radius , Circle2 c)
	{
		return c.get(radius);
	}
}
