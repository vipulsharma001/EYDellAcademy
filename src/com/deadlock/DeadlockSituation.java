package com.deadlock;

public class DeadlockSituation {
	public static void main(String[] args) {
		final String resource1 = "A";
		final String resource2	 = "B";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1 : Locked resource");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}synchronized(resource2)
					{
						System.out.println("Thread 1: Looking for Resource");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 : Locked resource");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}synchronized(resource1)
					{
						System.out.println("Thread 2: Looking for Resource");
					}
				}
			}
		};
		t1.start();
		t2.start();
		
	}
}
