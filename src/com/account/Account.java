package com.account;

public class Account {

	int acctId;
	String acctType;
	double acctBalance;
	
	public Account() {}
	
	public Account(int acctId,String acctType,double acctBalance) {
		
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
		
	}
	
	public void deposit(int amount) {
		
		
		acctBalance=acctBalance+amount;
		System.out.println("Balance after deposit:"+acctBalance);
		
	}
	public void withdraw(int amount) {
		
		if(amount>acctBalance) {
			System.out.println("Insufficient balance");
		}
		else {
			acctBalance=acctBalance-amount;
			System.out.println("Total balance after withdraw is :"+acctBalance);
		}
		
		
	}
	public int getBalance() {
		
		return (int)acctBalance;
	}
	public void display() {
		
		System.out.println("Displaying total account Details :"+acctId+" "+acctType+" "+acctBalance);
	}

}
