package com.genricsexplained;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class WithoutUseOfGeneric {
	public static void main(String[] args) {
		ArrayList newArr = new ArrayList<>();
		newArr.add("ABC");
		newArr.add(1123);
		
		
		String Str = (String) newArr.get(0);
		Integer intData = (Integer)newArr.get(1);
		
		Iterator itr = newArr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}
}
