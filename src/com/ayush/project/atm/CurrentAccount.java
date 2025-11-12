package com.ayush.project.atm;

public class CurrentAccount extends Account{
	
	public CurrentAccount(int accno, int pin, double balance) {
		super(accno, pin, balance);
	}
	
	public String getAccountType() {
		return "CURRENT ACCOUNT";
	}
}
