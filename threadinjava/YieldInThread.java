package com.threadinjava;


class Producer extends Thread
{
	public void run()
	{
		for(int i =0 ;i < 5 ;i++)
		{
			System.out.println("Producer Thread"+ i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread
{
	public void run()
	{
		for(int i =0 ;i < 5 ;i++)
		{
			System.out.println("Consumer Thread"+ i);
			Thread.yield();
		}
	}	
}
public class YieldInThread {
	public static void main(String[] args) {
		Thread P = new Producer();
		
		Thread C = new Consumer();
		
		P.setPriority(Thread.MAX_PRIORITY);
		C.setPriority(Thread.MIN_PRIORITY);
		
		P.start();
		C.start();
		
		
	}
	
}
