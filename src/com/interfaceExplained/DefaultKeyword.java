package com.interfaceExplained;


interface A
{
	public void square(int s);
	
	
	//default keyword is used to declare method in the interface
	default void show()
	{
		System.out.println("Hi default keyword here");
	}
}
public class DefaultKeyword implements A{
	
	@Override
	public void square(int s)
	{
		System.out.println("SQuare");
	}
	public static void main(String[] args) {
		DefaultKeyword obj1 = new DefaultKeyword();
		obj1.square(3);
		obj1.show();
	}
}
