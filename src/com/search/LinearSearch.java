package com.search;

public class LinearSearch {
	static int linearsearch(int[] arr, int len ,int n )
	{	
		for(int i =0 ;i<len ; i++)
		{
			if(n==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {21,23,43,20,45,54,71,29};
		int n = 29;
		int len = arr.length;
		System.out.println("Array before Search:" );
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("And number to find is : "+ n);
		int index =linearsearch(arr,len,n);
		if(index == -1 )
		{
			System.out.println("Element not in the array");
		}
		else
		{
			System.out.println("Element is at :"+ index);
		}
		
	}
}
