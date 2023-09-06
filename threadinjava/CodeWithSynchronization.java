package com.threadinjava;

class ShareResource1 {
	synchronized static void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}

class MyThreadA1 extends Thread
{
	
	public void run()
	{
		ShareResource1.print(5);
	}
}

class MyThreadB1 extends Thread
{
	
	public void run()
	{
		ShareResource1.print(10);
	}
}
public class CodeWithSynchronization {
	public static void main(String[] args) {
		ShareResource1 o1 = new ShareResource1();
		MyThreadA1 t1 = new MyThreadA1();
		MyThreadB1 t2 = new MyThreadB1();
		
		t2.start();
		t1.start();
		
	}
}