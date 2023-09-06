package com.collectionF;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> hsh = new TreeSet<>();
		hsh.add("Z");hsh.add("Z");hsh.add("Z");
//		hsh.add(null);hsh.add(null);hsh.add(null);
		hsh.add("X");hsh.add("Y");hsh.add("Z");
		
		Iterator<String> itr = hsh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}
}
