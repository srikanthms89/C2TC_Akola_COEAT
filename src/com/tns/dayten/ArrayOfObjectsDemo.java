//Program to demonstrate Array of student Objects
package com.tns.dayten;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//declares an array of Integers
		
		Student[] arr;
		//allocating memory for 5 objects of type student
		arr = new Student [5];
		
		//initialize the first elements of the array
		arr[0] = new Student (1,"kumar");
		//initialize the second elements of the array
		arr[1] = new Student (2,"vishal");
		//so on..
		arr[2] = new Student (3,"vishnu");
		arr[3] = new Student (4,"vibhav");
		arr[4] = new Student (5,"virat");
		
		
		//accessing the elements of the specified array
		for (int i =0;  i< arr.length; i++)
			System.out.println("Elements at " + i + " : " +arr[i].getRollNo()+" "+arr[i].getName());
		
		
	}

}
