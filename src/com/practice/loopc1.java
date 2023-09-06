package com.practice;

public class loopc1 {
	public static void main(String[] args)
	{	int[] arr= {1,3,4,5,6,7,8,9,10};
		//Advanced for loop for collection and array
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		String[] str= {"A","B","C","D","e"};
		//Advanced for loop for collection and String
		for(String y:str)
		{
			System.out.print(y+" ");
		}
		int n=1;
		while(n<=10)
		{
			System.out.print(n+" ");
			n=n+1;
		}
		System.out.println("\n");
		for(int i=0;i<11;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
//		for(int j=0;j<10;)
//		{
//			System.out.println("All is well");
//		}
		do {
			System.out.println(n);
		}while(n<=10);
	}
}
