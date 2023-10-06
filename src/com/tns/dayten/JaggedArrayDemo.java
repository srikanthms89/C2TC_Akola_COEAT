//Program to demonstrate Jagged Array
package com.tns.dayten;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int d[] [] = { {10,20,30}, {40},{12,21},{11}};
		
		System.out.println("Total rows in Array d : " + d.length);
		MLArray.printArray(d);
		
	}

}
