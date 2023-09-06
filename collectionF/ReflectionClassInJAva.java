package com.collectionF;


class SampleClass{}
interface MyInterface{}
public class ReflectionClassInJAva {
	void printName(Object obj)
	{
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}
	public static void main(String[] args) throws ClassNotFoundException {
		SampleClass obj = new SampleClass();
		ReflectionClassInJAva rc = new ReflectionClassInJAva();
		rc.printName(obj);
		
		Class c = boolean.class;
		System.out.println(c.getName());
		
		Class c2 = ReflectionClassInJAva.class;
		System.out.println(c2.getName());
		
		//forName is used to load the class Dynamically
		//returns the instance of the class
		Class c4 = Class.forName("com.collectionF.ReflectionClassInJAva");
		System.out.println(c4.getName());
	}
}
