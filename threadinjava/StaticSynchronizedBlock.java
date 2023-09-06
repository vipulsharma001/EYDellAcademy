package com.threadinjava;

class SharedResource2 {
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

class Thread1 extends Thread {
	public void run() {
		SharedResource2.print(5);
	}
}

class Thread2 extends Thread {
	public void run() {
		SharedResource2.print(10);
	}
}

class Thread3 extends Thread {
	public void run() {
		SharedResource2.print(15);
	}
}

class Thread4 extends Thread {
	public void run() {
		SharedResource2.print(20);
	}
}

//class Thread5 extends Thread {
//	public void run() {
//		SharedResources2.print(25);
//	}
//}
//
//class Thread6 extends Thread {
//	public void run() {
//		SharedResources2.print(30);
//	}
//	
//}




public class StaticSynchronizedBlock {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
	
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}

