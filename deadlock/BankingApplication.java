package com.deadlock;

class Customer
{
	int amount = 10000;
	public synchronized void withdraw(int amount)
	{
		System.out.println("Withdraw Amount : "+amount);
		if(this.amount<amount)
		{
			System.out.println("Less money in account ,deposit first");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		this.amount -= amount;
		System.out.println("Withdraw Completed...");
		
	}
	public synchronized void deposit(int amount)
	{
		System.out.println("User has come to deposit");
		int x= this.amount;
		this.amount=amount;
		System.out.println("Deposit Completed for amount "+amount+"\n ******************* \nTotal amount is :"+(x+amount));
		notify();
	}
}





public class BankingApplication {
	public static void main(String[] args) {
		final Customer c1 = new Customer();
		new Thread()
		{
			public void run()
			{
				c1.withdraw(5000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c1.deposit(10000);
			}
		}.start();
	}
}
