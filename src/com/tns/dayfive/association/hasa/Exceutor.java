package com.tns.dayfive.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
 
		 Address address = new Address("100 enclave","Akola","maharastra","500098");
		 Person person = new Person("kumar",address);
		 person.displayInfo();
	}

}
