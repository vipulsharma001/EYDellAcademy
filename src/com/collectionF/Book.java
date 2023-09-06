package com.collectionF;



public class Book implements Comparable<Book>{
	int bookId;
	String author ,publisher,name;
	int quantity;
	Book(int bookId, String author ,String publisher,String name,int quantity)
	{
		this.author=author;
		this.bookId=bookId;
		this.publisher=publisher;
		this.quantity=quantity;
		this.name=name;
	}
	@Override
	public int compareTo(Book o)
	{
		if(bookId>o.bookId)
		{
			return 1;
		}
		else if(bookId>o.bookId)
		{
			return -1;
		}
		else
			return 0;
	}
	
}
