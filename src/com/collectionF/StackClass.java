package com.collectionF;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		showPush(st,45);showPush(st,55);showPush(st,65);showPush(st,75);showPush(st,85);showPush(st,955);
		showPop(st);showPop(st);showPop(st);
		
	}
	static void showPush(Stack<Integer> obj,int n)
	{
		obj.push(new Integer(n));
		System.out.println("Stacked Number is: "+n);
		
	}
	
	static void showPop(Stack<Integer> obj)
	{
		obj.pop();
		System.out.println(obj);
	}
}
