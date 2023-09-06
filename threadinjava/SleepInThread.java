package com.threadinjava;

import java.util.concurrent.TimeUnit;

public class SleepInThread extends Thread {
	public static void main(String[] args) {
		SleepInThread t1 = new SleepInThread();
		SleepInThread t2 = new SleepInThread();
		
		t1.start();
		t2.start();

	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			try 
			{	Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(1);
//				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
			
		}

	}
}
