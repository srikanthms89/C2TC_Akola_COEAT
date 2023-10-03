
//Program to demonstrate encapsulation 
package com.tns.daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		// scanner object to accept user inputs 
		
		Scanner ob = new Scanner (System.in);
		
		String name;
		System.out.println(" Enter Person Name :");
		name = ob.next();
		
		System.out.println(" Enter age: ");
		int age = ob.nextInt();
		
		System.out.println("Enter gender : ");
		String gender = ob.next();
		
		System.out.println("Enter the taxable income: ");
		int income = ob.nextInt();
		
		
		//Person object  and initialize values using setter
		
		Person obj = new Person ();
		obj.setName(name);
		obj.setAge(age);
		obj.setGender(gender);
		obj.setIncome(income);
		
		//display person details using tostring () method
		System.out.println(obj);
		
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(obj); // tax calculation
		System.out.println(" After calculating tax:   ");
		System.out.println(obj);
		
		ob.close();
	}

}
