package com.practice;

public class stringAsAImmutableObject {
public static void main(String[] args) {
	//String is immutable and cannot be changed in any situation or fun
	String str=new String("ABC");
	System.out.println(str);
	str.concat("XYZ");
	str.replace("A", "X");
	System.out.println(str);
	
	
	//String Buffer came in 1.1
	
	StringBuffer br = new StringBuffer("ABC");
	System.out.println(br);
	br.append("XYZ");
	System.out.println(br);
	
	//String Builder 
	//String Builder is faster because of the faster synchronisation and came after JDK 1.5
		StringBuilder br1 = new StringBuilder("ABCDE");
		System.out.println(br1);
		br1.append("XYZ");
		System.out.println(br1);
}
}
