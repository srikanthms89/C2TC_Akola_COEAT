package com.tns.dayseven.overriding.covariant;

public class CovariantOverridingDemo {

	public static void main(String[] args)  throws CloneNotSupportedException{
	
		
		// new student object
		Student st1  = new Student (101,"BE","anil");
		st1.printData();

		//student object created using clone method
		//assuming type casting is required
		Student st2 = (Student ) st1.clone();
		st2.printData();
		
		//using covariant return type no need to type cast
		Student st3 = (Student)st1.clone();
		st3.setName("sachin");
		st3.setClassname("BE");
		st3.setRollNo(102);
		st3.printData();
	}

}
