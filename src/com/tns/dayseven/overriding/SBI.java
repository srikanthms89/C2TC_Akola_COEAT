//Program to demonstrate method overriding - Run time Polymorphism
package com.tns.dayseven.overriding;

//Sub class 
public class SBI extends RBI {
	
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
	public SBI getObject()
	{
		return this;
	}
	

}
