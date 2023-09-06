package com.practice;


interface LOL
{
	void show();
}
class B implements LOL
{
	public void show()
	{
		System.out.println("Hello from Class B");
	}
}
public class InterfaceImplentation {
	public static void main(String[] args) {
		LOL obj = new B();
		obj.show();
	}
}
