package com.collectionF;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer , String> hMap= new TreeMap<>();
		hMap.put(123, "A");
		hMap.put(34, "B");
		hMap.put(323, null);
		hMap.put(423, null);
		hMap.put(23, "D");
		hMap.put(623, "E");
		
		for(Map.Entry<Integer, String> m : hMap.entrySet())
				{
				System.out.println(m.getKey() + " : "+ m.getValue());
				}
	}
}
