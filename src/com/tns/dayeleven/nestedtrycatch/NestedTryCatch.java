//Program to demonstrate nested try catch
package com.tns.dayeleven.nestedtrycatch;

public class NestedTryCatch {
	
	public static void check() {
	String str = "TNSIFBANGALORE";
	int slen= str.length();
	 System.out.println("String length:" +slen);
	 
	 String anotherstring = "COEAT";
	 int y = 6;
	 try {
		   
		  //inner try block
		 try {
			 System.out.println(str.charAt(y)); //Exception occured
		 }catch(StringIndexOutOfBoundsException ex) {
			System.err.println("index is out of bounds " + ex.getMessage());
		 }
		 System.out.println("String length : " +anotherstring.length());

	}catch(NullPointerException  npe)
	 {
		System.err.println("Exception is thrown  " + npe.getMessage());
	 }
	
}
}
	


