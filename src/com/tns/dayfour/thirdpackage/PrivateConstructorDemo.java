package com.tns.dayfour.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		
		//Can't create object with private constructor
		// MyClass obj = new MyClass();
		
		MyClass  m1 = MyClass.getObject();
		m1.setId(10);
		
		
		MyClass m2= MyClass.getObject();
		m2.setId(20);
		
      MyClass m3= MyClass.getObject();
  	  m3.setId(30);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		

	}

}
