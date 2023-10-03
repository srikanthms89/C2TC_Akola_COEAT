package com.tns.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {

		// accessing the same package class
		Base  b1 = new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		//private members can't accessible
		
		b1.varDefault =11;
		b1.methodDefault();

		  b1.varPublic= 41;
		  b1.methodPublic();
		  
		  b1.varProtected =51;
		  b1.methodProtected();

	}

}
