package com.collectionF;

import java.util.HashMap;

public class HashmapPractice {
	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<>();
		h.put("A", 1);h.put("B", 2);h.put("C", 3);
		System.out.println(h);
		if(h.containsKey("B")	)
				{
			System.out.println("Hello B");
				}
	
}
}