package com.collectionF;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<String> vec = new Vector(10,5);
		vec.addElement("A");vec.addElement("B");vec.addElement("C");
		vec.addElement("Z");vec.addElement("X");vec.addElement("Y");
		vec.addElement("P");vec.addElement("Q");vec.addElement("R");
		vec.addElement("S");
		
		System.out.println(vec);
		
		
}
}