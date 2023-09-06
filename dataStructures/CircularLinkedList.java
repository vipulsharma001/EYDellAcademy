package com.dataStructures;

import com.dataStructures.DoublyLinkedList.Node;

public class CircularLinkedList {
	static 	 class Node {
		int data;
		Node next;
	
		Node(){}
	public Node(int data) {
			this.data = data;
		}
	 
	}
	private Node head,tail;
	public CircularLinkedList() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void insertAtFirst(int data)
	{
		Node newNode = new Node(data);
		if(head== null)
		{
			head=newNode;
			tail = newNode;
			newNode.next=head;
		}
		else
		{
			Node temp = head;
			newNode.next=temp;
			head=newNode;
			tail.next=head;
		}
	}
	public void insertAtLast(int data)
	{
		Node newNode = new Node(data);
		if(head== null)
		{
			head=newNode;
			tail = newNode;
			newNode.next=head;
		}
		else
		{
			
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	public void insertAtParticularIndex(int data,int pos)
	{	Node temp,newNode;
		newNode = new Node(data);
		int c;
		temp=head;
		c=size();
		if(temp== null || size()< pos)
		{
			System.out.println("Index is greater than the size of list");
		}
		else
		{
			newNode.data=data;
			for(int i1 =0;i1<pos;i1++)
			{
				temp=temp.next;
			}
			newNode.next = temp.next;
			temp.next= newNode;
		}
		
	}
	
	public int size()
	{
		int size = 1;
		if(head!=null)
		{
			Node temp = head;
			while(temp.next!=head)
			{
				temp=temp.next;
				size++;
				
			}
		}
		return size;
	}
	public void display() {
		Node temp = head;
		if (temp!= null) {
			do {
				System.out.printf("Element is : %d",temp.data);
				temp=temp.next;
			}while(temp!=head);

		}
		System.out.println("\n");
		

	}
	public void deleteNode(int data)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Node currentNode = head;
		Node previousNode = new Node();
		while(currentNode.data!=data)
		{
			if(currentNode.next==head)
			{
				System.out.println("Given Node with data is :"+data+"is not found in the given list");
			}
			previousNode= currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode == head && currentNode.next==head) {
			head=null;
		}
		if(currentNode==head)
		{
			previousNode =head;
			while(previousNode.next != head)
			{
				previousNode =previousNode.next;
			}
			head=currentNode.next;
			previousNode.next=head;
		}
		else if(currentNode.next ==head)
		{
			previousNode.next=head;
		}
		else
		{
			previousNode.next = currentNode.next;
		}
	}

	public static void main(String[] args) {
		CircularLinkedList demo =new CircularLinkedList();
		demo.insertAtFirst(1);
		demo.display();
		System.out.println("	Size : "+ demo.size());
		
		demo.insertAtFirst(2);
		demo.display();
		System.out.println("	Size : "+ demo.size());
		
		demo.insertAtLast(3);
		demo.display();
		System.out.println("	Size : "+ demo.size());
		
		demo.insertAtLast(4);
		demo.display();
		System.out.println("	Size : "+ demo.size());
		
		demo.insertAtParticularIndex(67,3);
		demo.display();
		System.out.println("	Size : "+ demo.size());
		
		demo.deleteNode(3);
		demo.display();
		System.out.println("	Size : "+ demo.size());
	}
}