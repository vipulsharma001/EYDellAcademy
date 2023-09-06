package com.practice;

class Parent9090 {
	void show() {
		System.out.println("In parent Class");
	}
	int d = 10 ;
}

public class SuperKeyword extends Parent9090{
	void show() 
	{System.out.println("this is in main class");}
	
	int d = 20 ;
	void display()
	{
		System.out.println("The value of current class object"+this.d);
		System.out.println("The value of parent class object"+super.d);
		this.show();
		super.show();
	}
	public static void main(String[] args) {
		SuperKeyword m = new SuperKeyword();
		m.display();
	}
}
