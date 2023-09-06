package com.practice;
//MemberInnerClass is non-static 
public class MemberInnerClass {
	private int data =10;
	class ABC
	{
		void show()
		{
			System.out.println("The number is : "+ data);
		}
	}
	public static void main(String[] args) {
		//Synatx to write object of Inner Class through Outer Class 
		MemberInnerClass obj1 = new MemberInnerClass();
		MemberInnerClass.ABC obj2= obj1.new ABC();
		obj2.show();
	}
}
