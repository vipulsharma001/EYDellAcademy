package com.collectionF;

import java.util.HashMap;
import java.util.Map;

public class HashMapForCustomClass {
	public static void main(String[] args) {
		HashMap<Integer, Book> hMap = new HashMap<>();
		Book b1 = new Book(1, "A", "V", "C", 10);
		Book b2 = new Book(2, "S", "H", "U", 20);
		Book b3 = new Book(3, "G", "R", "G", 30);
		
		hMap.put(123,b1);
		hMap.put(223,b2);
		hMap.put(323,b3);
		
		for(Map.Entry<Integer, Book> m : hMap.entrySet())
		{
			int key=m.getKey();
			Book b =m.getValue();
			
		System.out.println("Key :" + key + "   Details are :");
		 System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
		

	}
}
