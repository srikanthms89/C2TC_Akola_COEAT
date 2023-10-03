//program to demonstrate single inheritance
package com.tns.dayfive.singlelevelinheritance;

public class Student  extends Citizen{
	
	private int rollNo;
	private String collgeName;
	
	public Student() {
		super();
	}

	public Student(String name, String aadharNo, String address,long phNo,int rollNo, String collgeName) {
		super(name,aadharNo,address,phNo); // accessing parent class constructor
		this.rollNo = rollNo;
		this.collgeName = collgeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollgeName() {
		return collgeName;
	}

	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collgeName=" + collgeName + ", getName()=" + getName()
				+ ", getAaddharNo()=" + getAaddharNo() + ", getAddress()=" + getAddress() + ", getPhNo()=" + getPhNo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	

}
