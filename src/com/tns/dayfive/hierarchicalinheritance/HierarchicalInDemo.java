package com.tns.dayfive.hierarchicalinheritance;

public class HierarchicalInDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("..........person details .........");
		System.out.println(p1);
		
		Person p;
		
		p = new Person("kumar", "Mumbai");
		if (p instanceof Person)
			System.out.println("person Details " +p);
		
		p = new Employee("Akhil","Akola", 101, 50000,"IT");
		if( p instanceof Employee)
			System.out.println("Emplyee details "+ p);
		
		p = new Student ("vaishnavi","Akola","FE",99);
		if( p instanceof Student)
			System.out.println("Student details "+ p);
		
		

	}

}
