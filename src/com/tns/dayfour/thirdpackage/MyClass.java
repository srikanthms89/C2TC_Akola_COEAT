//program to demonstrate singleton class
package com.tns.dayfour.thirdpackage;

public class MyClass {

	private static MyClass obj = new MyClass();
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private MyClass() {
		System.out.println("Myclass object created");
	}
	
	public static MyClass getObject() //factory mrthod
	{
		return obj;
	}
	
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	
	
}
