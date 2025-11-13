package com.ayush.project.atm;

public class SavingAccount extends Account {
	
	public SavingAccount(String name, int pin, double balance){
		super(name, pin, balance);
	}
	
	public String getAccountType() {
		return "SAVING ACCOUNT";
	}
}
