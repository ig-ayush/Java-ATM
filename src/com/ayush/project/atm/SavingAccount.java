package com.ayush.project.atm;

public class SavingAccount extends Account {
	
	public SavingAccount(int accno, int pin, double balance){
		super(accno, pin, balance);
	}
	
	public String getAccountType() {
		return "SAVING ACCOUNT";
	}
}
