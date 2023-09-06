package com.search;


//fastest search
public class BinarySearch {
	static void bsearch(int[] arr ,int startPos, int endPos ,int n)
	{
		int midElement = (startPos+endPos)/2;
		while(startPos<= endPos)
		{
			if(arr[midElement]<n)
			{
				startPos = midElement+1;
				
			}
			else if(arr[midElement]==n)
			{
				System.out.println("Element found at :"+ midElement);
				break;
			}
			else
			{
				endPos =midElement-1;
			}
			midElement=(startPos+endPos)/2;
		}
		if(startPos>endPos)
		{
			System.out.println("ELement found is not found");
		}
	}
	
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
		int n = 29;
		bubblesort(arr);
		System.out.println("Elemetn to find is:"+n+"\nArray after sorting is:");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int lastElementInArray= arr.length-1;
		bsearch(arr,0,lastElementInArray,n);
		
		
	}
}
