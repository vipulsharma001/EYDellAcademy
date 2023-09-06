package com.threadinjava;

class A implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("##Thread A");
		}
	}
}
class B implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("@@Thread B");
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		A ob1 = new A();
		Thread  o1 = new Thread(ob1);
		
		
		B ob2 = new B();
		Thread  o2 = new Thread(ob2);
		
		
		o1.start();
		o2.start();
		System.out.println("Outside Run");
	}
}
