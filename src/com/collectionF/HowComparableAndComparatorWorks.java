package com.collectionF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {
	public static void main(String[] args) {
		int[] Arr = {10,9,8,7,6,5,4,3,2,1,0};
		Arrays.sort(Arr);
		System.out.println("Sorted String is :" +Arrays.toString(Arr));
		
		String[] StrArr = {"P","Q","A","T","S"};
		Arrays.sort(StrArr);
		System.out.println("Sorted String is :" +Arrays.toString(StrArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");listStr.add("X");listStr.add("A");listStr.add("P");listStr.add("A");listStr.add("V");
		Collections.sort(listStr);
		for(String str : listStr)
		{
			System.out.print(str+" ");
		}
	}
}
