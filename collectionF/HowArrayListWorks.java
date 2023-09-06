package com.collectionF;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		//CAn have multiple duplicate values
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		
		
		//CAn have multiple NULL values
		arrList.add(null);arrList.add(null);arrList.add(null);
		
		
		arrList.add("X");arrList.add("Y");arrList.add("Z");
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("X1");arrList2.add("Y2");arrList2.add("Z3");
		
		
		arrList.addAll(arrList2);//Function to add 2 arrayList
		
		System.out.println("Size of my Array List is :"+ arrList.size());//Function to get size of array list
		
		arrList.remove("X");//to remove certain element from array List
		
		arrList.set(1,"new element added on 1st index");//to add element at certain position
		
		arrList.retainAll(arrList2);//removing element from arrList and keeping all the relents from arrList2
		
		
		
		
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		arrList.clear();
	}
}
