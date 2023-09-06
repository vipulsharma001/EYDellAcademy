package com.genricsexplained;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnBoundedWildCard {
	public static void main(String[] args) {
		UnBoundedWildCard obj = new UnBoundedWildCard();
		List<String> listStr=   new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printData(listStr);
		
		List<Integer> listInt=   new ArrayList<>();
		listInt.add(7);
		listInt.add(9);
		obj.printData(listInt);
	}
	
	void printData(Collection<?> objToPrint)
	{
		System.out.println("[");
		for(Object obj :objToPrint)
		{
			System.out.println(obj.getClass().getCanonicalName()+" :"+obj);
		}
		
		
		System.out.println("]");
		System.out.println();
	}
}
