
//Program to define concrete class the implements the phone interface
package com.tns.dayeight.instnanceofinterface;

public class Jio implements Phone {
	
	@Override
	public void call ()
	{
		System.out.println("Calling using Jio");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using Jio");
	}

}
