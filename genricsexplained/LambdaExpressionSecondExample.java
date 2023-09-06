package com.genricsexplained;


@FunctionalInterface
interface isFunctional
{
	void show(String data);
}
public class LambdaExpressionSecondExample {
	public static void main(String[] args) {
		isFunctional obj = new isFunctional() {
			@Override
			public void show(String data)
			{
				System.out.println("Using Anonymous Inner:"+data);
			}
		};
		obj.show("Class way of Implementation");
		isFunctional obj2 = (demoData)->{
			System.out.println("Eliminating Anonymous Inner "+demoData);
			
		};
		obj.show("Class way of Implementation - Through Lambda Expression");
	}
}
