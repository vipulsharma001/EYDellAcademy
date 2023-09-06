package com.sorting;

public class MergeSort {
	static void mergesort(int[] arr, int startPos, int endPos) {
		if (startPos < endPos) {
			int midPos = (startPos + endPos) / 2;
			mergesort(arr, startPos, midPos);
			mergesort(arr, midPos + 1, endPos);
			merge(arr, startPos,midPos, endPos);
		}

	}
	static void merge(int arr[],int startPos ,int midPos,int endPos)
	{
		int i,j,k;
		
		int firstNum = midPos - startPos +1;
		int secondNum = endPos -midPos;
		
		int leftArray[] =new int[firstNum];
		int rightArray[] =new int[secondNum];
		
		for(i =0;i<firstNum;i++)
		{
			leftArray[i]= arr[startPos + i];
		}
		for(j =0;j<secondNum;j++)
		{
			rightArray[j]= arr[midPos + 1+j];
		}
		i=0;j=0;k=startPos;
		
		while(i<firstNum && j<secondNum)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k]= rightArray[j];
				j++;
			}
			k++;
		}
		while(i<firstNum)
		{
			arr[k]=leftArray[i];
		 i++;k++;
		}
		while(j<secondNum)
		{
			arr[k]=rightArray[j];
			j++;k++;
		}
	}
	public static void main(String[] args) {
		int[] arr = { 21, 23, 43, 20, 45, 54, 71, 29 };
		int l = arr.length;
		System.out.println("Array before Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		mergesort(arr, 0, l-1);
		System.out.println();
		System.out.println("Array After Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
