package com.practice;

class A {
	void show()
	{
		System.out.println("In Outer Class");
	}
	class B
	{
		void say()
		{
			System.out.println("In inner Class");
		}
	}
}

public class InnerClassInJava {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.show();
		A.B obj2 = obj1.new B();
		obj2.say();
	}
}
