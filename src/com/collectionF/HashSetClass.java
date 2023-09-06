package com.collectionF;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> hsh = new HashSet<>();
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
