package com.tns.dayeight.interfaces.implementinginterface;

public class BankImpl implements Bank {
	
	@Override
	public void deposit(Account account, double amount) {
		if(amount > DEPOSIT_LIMIT)
			System.err.println("Deposit not possible ...exceeds Deposit limit ");
		else
			account.setBalance(account.getBalance() + amount );
		  System.out.println(" Deposited " + amount + " in to account "+ account.getAccNo());
		
		
		
	}
	
	@Override
	public void withdraw (Account account , double amount ) {
		
		if(account.getBalance() - amount  >= MIN_BALANCE) {
			account.setBalance(account.getBalance()- amount);
			System.out.println("Wthdrawn " + amount + " from account "+ account.getBalance());
		}
		else
		{
			System.out.println("Insufficient balance in account : " + account.getAccNo());
		}
		
	}

}
