package com.exceptionH;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Main Method");
		try {
			ExceptionPropagation obj = new ExceptionPropagation();
			obj.a();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main method"+e.getMessage());
		} 
	}
	void a() throws InterruptedException
	{	
	 	System.out.println("Method A");
		b();
	}
	void b() throws InterruptedException
	{	System.out.println("Method B");
		c();
		throw new InterruptedException("thread error");
	}
	void c()
	{
		System.out.println("Method C");
	}
}
