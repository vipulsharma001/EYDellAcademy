package com.practice;

public class eyemp {
	int empid;
	String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args)
	{
		eyemp emp1= new eyemp();
		emp1.setName("Vipul");
		emp1.setEmpid(60);
		System.out.println(emp1.getName());
		System.out.println(emp1.getEmpid());
	}
}
