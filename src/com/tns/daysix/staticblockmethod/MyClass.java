//program to demonstrate static block
package com.tns.daysix.staticblockmethod;

public class MyClass {
	
	private int section;  // non - static  or instance variable
	private static int srNo;   // static or class variable 
	
	//static block
	static
	{
		System.out.println(" ...... within static block......");
		srNo =1000;
	}
	//default constructor
	MyClass() {
		System.out.println("........within Default constructor ");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [Serial no "+srNo+",section=" + section + "]";
	}
	
	// static method
	static void display()
	{
		//System.out.println("Section :" +section); //can't access non static members
		System.out.println("Serial no " + srNo);
	}
	
	
	
	
	
	

}
