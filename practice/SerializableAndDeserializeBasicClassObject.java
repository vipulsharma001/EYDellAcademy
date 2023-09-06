package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee72 implements Serializable
{
	int empId;
	String empname ;
	Employee72(int empId,String empname)
	{
		this.empId=empId;
		this.empname=empname;
	}
}
public class SerializableAndDeserializeBasicClassObject {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Employee72 emp = new Employee72(123,"ABC");
		FileOutputStream fos = new FileOutputStream("abc723.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		
		FileInputStream fis = new FileInputStream("abc723.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee72 emp2 = (Employee72)ois.readObject();
		
		
		System.out.println(emp2.empId+" "+emp2.empname);
		oos.close();
		ois.close();
		
	}
}
