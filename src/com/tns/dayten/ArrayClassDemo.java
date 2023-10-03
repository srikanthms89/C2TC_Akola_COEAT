//Program to Demonstrate Array class methods

package com.tns.dayten;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		//Get the Array
		int intArr[] = { 10,7,20,100,30,40,78,89};
		
		//To print the elements in one line
		System.out.println("Array is: "+ Arrays.toString(intArr));
		
		Arrays.sort(intArr);

		System.out.println("...........After sorting ...........");
		System.out.println("Array is: "+ Arrays.toString(intArr));
		
		int intkey= 200;
		
		//print the key and corresponding index
		
		System.out.println(intkey + "found at index =" +Arrays.binarySearch(intArr, intkey));
		System.out.println(intkey + "found at index =" +Arrays.binarySearch(intArr, 1, 3, intkey));
		
		//Get the second array
		int intArray2[] = {10,20,30,40};
		
		System.out.println("Second array " +Arrays.toString(intArray2));
		
		
		//To compare both arrays
		if(Arrays.equals(intArr, intArray2))
			System.out.println("Both arrays are equal");
		else
			System.out.println("arrays are not equal");
		//creates a new array with a specified length
		
		System.out.println("\n New Arrays by copyOf : \n");
		
		int intArr3[]= Arrays.copyOf(intArray2, 4);
		
		System.out.println("Integer Array: " +Arrays.toString(intArr3));
		
		// To fill the arrays with key 200
		
		Arrays.fill(intArr3, intkey);
		System.out.println("Integer Array on filling 200: " +Arrays.toString(intArr3));
		
	}

}
