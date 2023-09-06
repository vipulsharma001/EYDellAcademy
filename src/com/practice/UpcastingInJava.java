package com.practice;

class Animal
{
	String name;
	void say()
	{
		System.out.println("Animal");
	}
}
class fish extends Animal
{

	String Color;
	@override
	void say()
	{
		System.out.println("Fishh");
	}
}
public class UpcastingInJava {
	public static void main(String[] args) {
		Animal a1=new fish();
		//When Parent class instance variable is used to assign child class object ,it is called upcasting
		//By this method we can access the variables of class Animal 
		//and the overwritten function of Animal class (i.e. say)
		a1.say();
	}
}
