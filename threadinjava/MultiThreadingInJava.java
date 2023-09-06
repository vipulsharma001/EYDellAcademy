package com.threadinjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class WorkerThread implements Runnable
{
	private String message ;
	public WorkerThread(String s)
	{
		this.message = s;
		
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"start :"+ message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName()+"end");
	}
	
}
public class MultiThreadingInJava {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(100);
		
		for(int i=1 ;i<10 ; i++)
		{
			Runnable worker = new WorkerThread(" "+i);
			executor.execute(worker);
		}
		System.out.println("Try to Shut Down Executor");
		executor.shutdown();
		try {executor.awaitTermination(5, TimeUnit.SECONDS);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.err.println("Task Interrupted");
		}finally{
			if(!executor.isTerminated())
			{
				System.out.println("Cancel Non-finshed Task");
			}
		}
		
		executor.shutdownNow();
		System.out.println("Shut Down Ultimated Finished");
	}
}
