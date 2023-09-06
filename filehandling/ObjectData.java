package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {
	public static void main(String[] args) {
		String str = new String("Hello Vipul this side");
		Integer i = new Integer(69);
		try {
			FileOutputStream fos = new FileOutputStream("C:/Files/ABC12.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC12.txt"));
			
			oos.writeObject(str);
			oos.writeObject(i);
			
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Files/ABC12.txt"));
			System.out.println("String Data is :"+(String)ois.readObject());
			System.out.println("Integer Data is :"+(Integer)ois.readObject());
//			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
