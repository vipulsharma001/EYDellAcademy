package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("Abc");
		shoppingList.add("bbc");
		shoppingList.add("cbc");
		shoppingList.add("dbc");
		shoppingList.add("ebc");
		shoppingList.add("fbc");
		shoppingList.add("gbc");
		
		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(item->item.toUpperCase()).filter(item->item.startsWith("d")).forEach(item->System.out.println(item));
		
//		try {
//			shoppingListStream.forEach(item->System.out.println(item));
//		} catch (IllegalStateException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		
	}
}
