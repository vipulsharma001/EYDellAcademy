package com.threadinjava;

class ShareResource {
	void print(int n)
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

class MyThreadX extends Thread
{
	ShareResource sR;
	MyThreadX(ShareResource sR)
	{
		this.sR=sR;
	}
	public void run()
	{
		sR.print(5);
	}
}

class MyThreadY extends Thread
{
	ShareResource sR;
	MyThreadY(ShareResource sR)
	{
		this.sR=sR;
	}
	public void run()
	{
		sR.print(10);
	}
}
public class CodeWithoutSynchronization {
	public static void main(String[] args) {
		ShareResource o1 = new ShareResource();
		MyThreadX t1 = new MyThreadX(o1);
		MyThreadY t2 = new MyThreadY(o1);
		
		t1.start();
		t2.start();
	}
}
