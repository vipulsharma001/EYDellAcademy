package com.collectionF;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer , String> hMap= new HashMap<>();
		hMap.put(123, "A");
		hMap.put(null, "B");
		hMap.put(323, null);
		hMap.put(423, null);
		hMap.put(null, "D");
		hMap.put(623, "E");
		
		for(Map.Entry<Integer, String> m : hMap.entrySet())
				{
				System.out.println(m.getKey() + " : "+ m.getValue());
				}
	}
}
