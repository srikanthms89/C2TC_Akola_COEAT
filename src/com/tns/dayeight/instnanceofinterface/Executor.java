package com.tns.dayeight.instnanceofinterface;

public class Executor {

	public static void main(String[] args) {

         Phone p1 = PhoneFactory.createPhone("samsung");
         p1.call();
         p1.sms();
         
         p1 = PhoneFactory.createPhone("jio");
         
         p1.call();
         p1.sms();
		 

	}

}
