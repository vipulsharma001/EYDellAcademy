package com.practice;

public class StaticKeyword {
 int c;
 StaticKeyword(){
	 c++;
	 System.out.println("Number is :"+ c);
 }
 public static void main(String[] args) {
	StaticKeyword c1= new StaticKeyword();
	StaticKeyword c2= new StaticKeyword();
	StaticKeyword c3= new StaticKeyword();
}
}

//but when int c is changed into "static int c" the output will be 1 2 3