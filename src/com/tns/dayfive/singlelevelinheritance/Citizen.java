//Program to demonstrate Single level inheritance with this and super keyword
package com.tns.dayfive.singlelevelinheritance;

public class Citizen {
	
	private String name;
	private String aaddharNo;
	private String address;
	private long phNo;
	
	public Citizen() {
		
		System.out.println("Citizen obj created");
		
	}

	public Citizen(String name, String aaddharNo, String address, long phNo) {
		
		this.name = name;
		this.aaddharNo = aaddharNo;
		this.address = address;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAaddharNo() {
		return aaddharNo;
	}

	public void setAaddharNo(String aaddharNo) {
		this.aaddharNo = aaddharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aaddharNo=" + aaddharNo + ", address=" + address + ", phNo=" + phNo + "]";
	}
	
	
	
	

}
