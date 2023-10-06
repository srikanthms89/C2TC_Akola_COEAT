//Program to demonstrate try catch block
package com.tns.dayeleven.trycatch;

public class TryCatchExample {
	
	static void performDiviosion(int x, int y) {
		System.out.println("Iam in method");
		int z;
		try {
			System.out.println("Iam in try block");
			z= x/y;
			System.out.println("Result of z :" +z) ;// This message will be printed if no exception occurs
		} catch ( ArithmeticException e)
		{
			System.out.println("Iam in catch block " + e.getMessage());
		}
		
	}

}
