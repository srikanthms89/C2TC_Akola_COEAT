package com.tns.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person (); //default constructor
		
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter the person details :");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		p1.setPersonName(name);
	 
		//p1.personName = name;  private members can't accesible
		
		System.out.println("person details Name :" +p1.getPersonName() + "\t age :"+ p1.getPersonAge()+"\t city" + p1.getPersonCity() );
	
		 System.out.println("Enter Person details: name, age and city");
		 name = sc.nextLine();
		 age = sc.nextInt();
		 sc.nextLine();
		 city = sc.nextLine();
		 
		 p1 = new Person(name,age,city); //parameterized constructor invoked
		 System.out.println("person details Name :" +p1.getPersonName() + "\t age :"+ p1.getPersonAge()+"\t city" + p1.getPersonCity() );
		 
		 sc.close();
	}

}
