package com.tns.dayeight.functionalinterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {


		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		
		//using Lambda expression 
		
		GreetInterface g1 = ()   -> { 
			return  "Good day ";
		};
		
		System.out.println(g1.greet());

	}

}
