package com.genricsexplained;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
	public static void main(String[] args) {
		List<Integer> listint = new ArrayList<Integer>();
		listint.add(123);
		listint.add(223);
		listint.add(323);
		printListItem(listint);
		
		List<Number> listfloat = new ArrayList<Number>();
		listfloat.add(3.14f);
		listfloat.add(79.9F);
		listfloat.add(89L);
		printListItem(listfloat);
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(69.9D);
		listDouble.add(79.9D);
		listDouble.add(89.9D);
//		printListItem(listDouble);printListItem(listDouble);
	}
	 static void printListItem(List<? super Integer> list)
	{
		for(Object num: list)
		{
			System.out.println(num);
		}
	}
}
