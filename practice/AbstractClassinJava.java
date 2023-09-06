package com.practice;


abstract class Banks{
	abstract int ROI();
}

class Sbi extends Banks{
	int ROI()
	{
		return 7;
	}
}
public class AbstractClassinJava {
 public static void main(String[] args) {
	Banks obj = new Sbi();
	System.out.println(obj.ROI());
}
}
