package com.ayush.project.atm;

import java.util.Scanner;

public abstract class Account {
	
	protected String name;
	protected int pin;
	protected double balance;
	
	public Account(String name, int pin, double balance) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}
	
	public boolean checkPIN(int inputPIN) {
		if(inputPIN == pin) {
			return true;
		}
		return false;
	}
	
	public String getAccountNo() {
		return name;
	}
	
	public void Deposit(double amount) {
		if(amount <= 0) {
			System.out.println("ENTER VALID AMOUNT TO DEPOSIT");
			return;
		}
		
		balance += amount;
		System.out.println("YOUR ₹" + amount + " IS DEPOSIT TO YOUR ACCOUNT.");
	}
	
	@SuppressWarnings("resource")
	public void withdraw(double amount) {
//		Scanner sc = new Scanner(System.in); 
		if(amount > balance) {
			System.out.println("INSUFFICIENT BALANCE");
		} else if(amount == balance) {
			System.out.println("THIS WITHDRAW MAKE YOUR BALANCE 0");
//			System.out.println("WANT TO CONTINUE (Y/N)");
//			String no = sc.next();
//			if(no.equalsIgnoreCase("no") || no.equalsIgnoreCase("n")) {
//				return;
//			}
			
		} else {
			balance -= amount;
			System.out.println("YOUR ₹" + amount + " IS WITHDRAW FROM YOUR ACCOUNT.");			
		}
		
//		sc.close();
	}
	
	public abstract String getAccountType();
}
