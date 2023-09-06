package com.collectionF;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		LinkedHashSet<String> hsh = new LinkedHashSet<>();
		hsh.add("Z");hsh.add("Z");hsh.add("Z");
		hsh.add(null);hsh.add(null);hsh.add(null);
		hsh.add("X");hsh.add("Y");hsh.add("Z");
		
		Iterator<String> itr = hsh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}
}
