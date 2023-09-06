package com.practice;

public class minvalueinarray {
	 void min(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int arr[]= {2,3,45,67,54,32,4,1,34,5,7};
		minvalueinarray obj = new minvalueinarray()
;		obj.min(arr);
	}
}
