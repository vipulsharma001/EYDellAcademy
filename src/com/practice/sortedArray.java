package com.practice;

import java.util.Arrays;

public class sortedArray {
public static void main(String[] args) {
	int[] arr1= {1,6,5,3,4,99,76};
	Arrays.sort(arr1);
	System.out.println("Sorted Array:"+ Arrays.toString(arr1));
	
	String[] str= {"A","Y","x","k"};
	Arrays.sort(str);
	System.out.println("Sorted Array:"+ Arrays.toString(str));
}
}

