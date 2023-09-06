package com.collectionF;


import java.util.HashSet;
import java.util.Iterator;

public class BookByHashSet {
	
	public static void main(String[] args) {
		HashSet<Book> arrList = new HashSet<>();
		Book b1=new Book(12,"A","B","C",230);
		Book b2=new Book(13,"D","E","F",231);
		Book b3=new Book(14,"G","H","I",232);
		
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b3);
		
		arrList.add(b3);
		arrList.add(b2);arrList.add(b2);
		
		for(Book b : arrList)
		{
			System.out.println("Book id:"+b.bookId +" Book author:" +b.author+" Book Publisher"+b.publisher+ " Book Name"+b.name+" Book Quantity"+b.quantity);
		}
		Iterator<Book> itr = arrList.iterator();
		while(itr.hasNext())
		{	Book b = itr.next();//to make object for Book
			System.out.println("Book id:"+b.bookId +" Book author:" +b.author+" Book Publisher"+b.publisher+ " Book Name"+b.name+" Book Quantity"+b.quantity);
			
		}
}
}
