package com.practice;

import java.util.Arrays;

public class arrayComparision {
public static void main(String[] args) {
	int[] arr1= {1,2};
	int[] arr2= {1,2};
	boolean[] b1= {true,false};
	boolean[] b2= {true,false};
	boolean result1 = Arrays.equals(arr1, arr2);
	boolean result2 = Arrays.equals(b1, b2);
	System.out.println("Output is : "+result1);
	System.out.println("Output is : "+result2);

}
}
