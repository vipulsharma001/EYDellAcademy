package com.practice;

import java.io.Serializable;

public class Entity implements Serializable{
	private static final 
	int emp_id;
	String emp_name;
	//No arg Constructor
	Entity()
	{
		
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	
}
