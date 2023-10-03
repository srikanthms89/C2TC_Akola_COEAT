//Program to demonstrate static variable
package com.tns.daysix.stativariable;

public class Employee {
	//Declare instance variables
	private String name;
	private int id;
	
	//Declare a static variables companyname with data type String and assign value
	static String companyName = "TNS";
	
	//Declare a two parameter constructor 
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	

}
