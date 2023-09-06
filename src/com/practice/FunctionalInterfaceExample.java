package com.practice;

@FunctionalInterface
interface SampleData{
	void fullname(String Fname, String Lname);
}
public class FunctionalInterfaceExample implements SampleData {
	@override
	public void fullname(String Fname, String Lname)
	{
		System.out.println("Name is :"+Fname+" "+Lname);
	}
	public static void main(String[] args)
	{
		FunctionalInterfaceExample ob1= new FunctionalInterfaceExample();
		ob1.fullname("ABC","XYZ");
	}

}
