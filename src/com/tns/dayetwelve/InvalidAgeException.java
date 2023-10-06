//Program to demonstrate User defined Exception class
package com.tns.dayetwelve;

public class InvalidAgeException  extends Exception{
	

	InvalidAgeException(){
		super("Invaid age");
	}
	
	InvalidAgeException(String message){
		super(message);
	}
}
