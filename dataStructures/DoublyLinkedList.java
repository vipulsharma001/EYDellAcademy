package com.dataStructures;

public class DoublyLinkedList {
	 class Node {
		int data;
		Node next;
		Node previous;
	
	 
	public Node(int data) {
			this.data = data;
		}
	 }
	Node head, tail = null;

	public void addItem(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail=newNode;
			head.previous = null;
			head.next = null;

		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}

	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;

		}
		System.out.println("Nodes of doubly linked list:");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}

	}

	public static void main(String[] args) {
		DoublyLinkedList demo = new DoublyLinkedList();
		demo.addItem(10);
		demo.addItem(15);
		demo.addItem(10);
		demo.addItem(10);
		demo.addItem(10);

		demo.display();

	}

}
