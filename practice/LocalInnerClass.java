package com.practice;

public class LocalInnerClass {
	private int data = 10;

	void message() {
		class XYZ {

			void show() {
				System.out.println("the Value of data is :" + data);
			}
		}
		XYZ obj1 = new XYZ();
		obj1.show();
	}

	public static void main(String[] args) {
		LocalInnerClass obj2 = new LocalInnerClass();
		obj2.message();
	}
}
