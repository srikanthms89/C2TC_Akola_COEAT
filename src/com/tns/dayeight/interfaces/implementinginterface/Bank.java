package com.tns.dayeight.interfaces.implementinginterface;

//Bank interface
public interface Bank {
	
	double MIN_BALANCE = 1000;
	double DEPOSIT_LIMIT = 25000;
	double INTEREST_RATE = 7.9;
	
	void deposit (Account account ,double amount);
	void withdraw (Account account ,double amount);

	
}
