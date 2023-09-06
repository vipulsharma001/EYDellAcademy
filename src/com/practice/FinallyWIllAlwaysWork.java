package com.practice;

public class FinallyWIllAlwaysWork {
	public static void main(String[] args) {
		int result=say();
		System.out.println("Result is "+result);
	}
	static int say()
	{
		try
		{
			return 123;
		}
		finally
		{
			System.out.println("Output will be 123 IG.");
		}
	}
}
