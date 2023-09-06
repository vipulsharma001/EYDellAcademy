package com.sorting;

public class BubbleSort {
	
	static void bubblesort(int[] arr)
	{
		int temp=0;
		
		for(int i =0 ;i<arr.length ; i++)
		{
			for(int j =1;j<(arr.length);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {21,23,43,20,45,54,71,29};
		System.out.println("Array before Sort:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		bubblesort(arr);
		System.out.println();
		System.out.println("Array After Sort:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
