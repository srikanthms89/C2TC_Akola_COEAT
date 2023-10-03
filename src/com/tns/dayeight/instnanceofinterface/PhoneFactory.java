//Program to define Factory method
package com.tns.dayeight.instnanceofinterface;

public class PhoneFactory {
	
	public static Phone  createPhone(String company) {
		if(company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		
		return null ;
		
	}

}
