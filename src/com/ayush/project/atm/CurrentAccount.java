package com.ayush.project.atm;

public class CurrentAccount extends Account{
	
	public CurrentAccount(String name, int pin, double balance) {
		super(name, pin, balance);
	}
	
	public String getAccountType() {
		return "CURRENT ACCOUNT";
	}
}
