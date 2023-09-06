package com.practice;

import java.util.Objects;

class Employee
{
	String FName;

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(FName, other.FName);
	}
	
}
public class UserDefinedClassEqualsTo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setFName("Vipul");
		e2.setFName("Vipul");
		if(e1.equals(e2))
		{
			System.out.println("Equal works with Custom Class (but not without hascode() snippet above)");
		}
		else
		{
			System.out.println("Equal does not works with Custom Class");

		}
		System.out.println("Memory Address is : "+ e1.hashCode());
		System.out.println("Memory Address is : "+ e2.hashCode());
	}
}
