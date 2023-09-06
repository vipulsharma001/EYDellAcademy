package com.threadinjava;

public class ThreadEx1 extends Thread {
	public static void main(String[] args) {
		ThreadEx1 thread = new ThreadEx1();
		System.out.println("one ");
		thread.start();
		System.out.println("two");
	}

	public void run() {
		System.out.println("three");
	}
}