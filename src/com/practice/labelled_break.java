package com.practice;

public class labelled_break {

	public static void main(String[] args) {
		XYZ:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==2 && j==2)
				{
					break XYZ;
				}
				System.out.println(i+" "+j);
			}
		}
	}
}
