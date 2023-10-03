//Program to demonstrate Constructor
package com.tns.daythree.constructor;

public class Customer {
	
	private String customerName;
	private int custmerId;
	private String customerCity;
	
	//Default Constructor
	public Customer() {
		
		System.out.println("Default constructor");
	}

	//parameterized constructor
	//use of this keyword
	public Customer(String customerName, int custmerId, String customerCity) {
		
		this(); //calling default constructor
		System.out.println(" Parameterized constructor");
		this.customerName = customerName;
		this.custmerId = custmerId;
		this.customerCity = customerCity;
	}
	//getter and setter

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustmerId() {
		return custmerId;
	}

	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", custmerId=" + custmerId + ", customerCity=" + customerCity
				+ "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	

}
