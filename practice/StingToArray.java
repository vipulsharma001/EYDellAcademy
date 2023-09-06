package com.practice;

public class StingToArray {
	public static void main(String[] args) {
		String str = "Vipul is Cool";
		char[] chr = new char[str.length()];
		for(int i=0;i<str.length();i++ )
		{
			chr[i]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++ )
		{
			System.out.print(chr[i]);
		}
		System.out.println(chr.toString());
	}
}
