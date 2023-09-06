package com.threadinjava;

public class ClassThreadEx1 extends Thread{
	public static void main(String[] args) {
		 ClassThreadEx1 obj1 = new ClassThreadEx1();
		 obj1.start();
	}
	public void run()
	{
		System.out.println("Inside Run");
	}
}