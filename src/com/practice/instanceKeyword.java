package com.practice;

public class instanceKeyword {
	public static void main(String[] args)
	{
		instanceKeyword obj = new instanceKeyword();
		System.out.println(obj instanceof instanceKeyword);
		obj=null;
		System.out.println(obj instanceof instanceKeyword);
	}
}
