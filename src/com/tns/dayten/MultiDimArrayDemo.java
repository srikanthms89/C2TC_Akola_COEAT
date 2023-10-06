//Program to demonstrate class with Multidimensional Array
package com.tns.dayten;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
	
		int c[][] = { { 12,24}, {20,30},{40,50}}; // new int[3][2]
		
		System.out.println("No. of Rows in C array : " +c.length);
		
		MLArray.printArray(c);

	}

}
