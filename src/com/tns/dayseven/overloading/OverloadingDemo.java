//Program to demonstrate method overloading - Comiple Time polymorphism
package com.tns.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("...........constructor overloading..........");
		Point p = new Point (); // default constructor invoked
		System.out.println(p);
		
		Point p1 = new Point (15.5f); // single parameter constructor
		System.out.println(p1);
		
		Point p2 = new Point (15.6f, 20.7f);// two parameters
		System.out.println(p2);
		
		System.out.println(".................method Overloading..........");
		System.out.println("Addition of two Integers :" +MethodOverloading.addition(10, 20));
		System.out.println("Addition of two float :" +MethodOverloading.addition(10.0f, 20.0f));
		System.out.println("Addition of one int and one float :" +MethodOverloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one int :" +MethodOverloading.addition(10.0f, 20));
		System.out.println("Addition of two Strings :" +MethodOverloading.addition("COET", "Akola"));
	}

}
