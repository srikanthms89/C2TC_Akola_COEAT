package com.tns.dayeight.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

		Student s = new Student (101,"Rakesh",50000,"CSE");
		if (s instanceof Registrable)
		{
			System.out.println("Student is Registrable");
			System.out.println(s);
		}
		else
			System.out.println("Student is not Registrable");
	}

}
