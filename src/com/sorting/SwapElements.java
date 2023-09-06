package com.sorting;

public class SwapElements {
	public static void main(String[] args) {
		int[] arr= {20,3,4,54,12,23,90};
		int[] arr2= new int[arr.length-1];
		int j=0;
		for(int i =0;i<arr.length;i++)
		{
			if(i!=3)
			{
				arr2[j]=arr[i];
				j++;
			}
			else
			{ 
				continue;
			}
		}
		for(int i =0;i<arr.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
}
