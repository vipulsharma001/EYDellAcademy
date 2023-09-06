package com.threadinjava;

public class JoinInThread extends Thread {
	public static void main(String[] args) {
		JoinInThread j1 = new JoinInThread();
		JoinInThread j2 = new JoinInThread();
		JoinInThread j3 = new JoinInThread();
		
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		j2.start();
		j3.start();
		
	}
	public void run()
	{
		for(int i =0; i<5 ; i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Running Thread Name :" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
