package com.practice;

public class PersonData implements Cloneable {
	int person_id;
	String person_name;
	PersonData(int person_id,String person_name)
	{
		this.person_id=person_id;
		this.person_name=person_name;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonData obj1 = new PersonData(123,"Ayush");
		PersonData obj2=(PersonData) obj1.clone();
		System.out.println("Person Id is : "+obj1.person_id+" and Person name is : "+obj1.person_name+"Hashcode:"+obj1.hashCode());
		System.out.println("Person Id is : "+obj2.person_id+" and Person name is : "+obj2.person_name+"Hashcode:"+obj2.hashCode());
	}
}
