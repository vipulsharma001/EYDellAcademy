package com.collectionF;


import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
        Hashtable<String, Integer> h = new Hashtable<>();
 
        h.put("A", 1);
        h.put("B", 2);
        h.put("C", 3);
 
        for(Map.Entry<String, Integer> m : h.entrySet())
		{
		System.out.println(m.getKey() + " : "+ m.getValue());
		}
    }
}	
