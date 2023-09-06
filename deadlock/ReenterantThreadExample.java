package com.deadlock;

class Reenterant
{
	public synchronized void m()
	{
		n();
		System.out.println("I am in m synchronized method");
	}
	
	public synchronized void n()
	{
		
		System.out.println("I am in n synchronized method");
	}
	
	
}


public class ReenterantThreadExample {
	public static void main(String[] args) {
		final Reenterant r = new Reenterant();
		new Thread()
		{
			public void run()
			{
				r.m();
			}
		}.start();
	}
}
