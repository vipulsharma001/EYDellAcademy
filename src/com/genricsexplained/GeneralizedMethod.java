package com.genricsexplained;

public class GeneralizedMethod {
	public static void main(String[] args) {
		Integer[] iarr = {10,5,6,4,3,72,97,9};
		String[] sarr = {"R","W","X","K","L"};
		
		System.out.println("Printing Integers");
		printArray(iarr);
		System.out.println("Printing Strings");
		printArray(sarr);
	}
	
	
	static<P> void printArray(P[] element)
	{
		for(P ele: element)
		{
			System.out.println(ele+" ");
		}
		System.out.println();
	}
}
