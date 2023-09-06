package com.practice;

abstract class sample {
	abstract void show();

}

public class AnonymousInnerClass  {
	public static void main(String[] args) {
		sample obj1 = new sample() {
			
			@Override
			void show() {
				System.out.println("Hello Everyone");
				
			}
		};
		obj1.show();
	}
}
