package com.collectionF.Annotations;

@JsonSerializable
public class person {
	@JsonElement
	private String Fname;
	@JsonElement
	private String Lname;
	@JsonElement (key="personAge")
	private String age;
	private String address;
	
	public person(String Fname , String Lname)
	{
		super();
		this.Fname=Fname;
		this.Lname=Lname;
	}
	public person(String Fname , String Lname , String age)
	{
		super();
		this.Fname=Fname;
		this.Lname=Lname;
		this.age=age;
		
	}
	
	@init
	private void initNames()
	{
		this.Fname=this.Fname.substring(0,1).toUpperCase()+this.Fname.substring(1);
		this.Lname=this.Lname.substring(0,1).toUpperCase()+this.Lname.substring(1);
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
