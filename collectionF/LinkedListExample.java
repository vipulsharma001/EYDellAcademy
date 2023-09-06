package com.collectionF;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		
		list.add("X");list.add("Y");list.add("Z");
		
		list.add(null);list.add(null);list.add(null);
		
		list.addFirst("first element");
		list.addLast("last element");
		
		Object firstElement = list.getFirst();
		System.out.println("First Element :"+firstElement);
		
		Object lastElement = list.getLast();
		System.out.println("Last Element :"+lastElement);
		
		int pos = list.indexOf("Y");
		System.out.println("Index of element Y is : "+pos);
		
		int pos2 = list.lastIndexOf(null);
		System.out.println("Index of element null is : "+pos2);
		
		list.add(3, "world ");
		list.add(3, "hello ");
		list.removeFirst();
		list.removeLast();
		String s = list.poll();
		System.out.println(s);
		Object s2 = list.pollLast();
		
		
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next()+" ");
//		}
		
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous()+" ");
		}
	}
}
