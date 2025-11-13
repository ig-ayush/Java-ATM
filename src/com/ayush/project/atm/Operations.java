package com.ayush.project.atm;

import java.util.*;

public class Operations {
	
	Map<Integer, Account> account = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public Operations() {
		account.put(1010, new SavingAccount("Ayush Acharya", 1510, 2000));
		account.put(1020, new CurrentAccount("Jeevan Shetty", 1015, 3000));
	}
	
	//	START FUNCTION
	public void start() {
		
		System.out.println("WELCOME TO JAVA ATM");
		
		while(true) {
			
			System.out.println("ENTER YOUR ACCOUNT NUMBER");
			System.out.println("want to exit click yes/y");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y" )) {
				System.out.println("GOOD BYE!!");
				break;
			}
			
			int accno = Integer.parseInt(input.trim());
			
			Account acc = account.get(accno);
			
			if(acc == null) {
				System.out.println("ENTERED ACCOUNT NUMBER NOT FOUND!!");
				continue;
			}
			
			System.out.println("ENTER YOUR PIN");
			int inputPin = sc.nextInt();
			
			boolean validPin = acc.checkPIN(inputPin);
			
			if(!validPin) {
				System.out.println("Invalid PIN. Returning to main menu.");
				continue;
			} 
			
			
			menu(acc);
		}
		
		
	}
	
	//DEPOSIT	
	public void deposit(Account acc) {
		double amount = sc.nextDouble();
		System.out.println("ENTER THE AMOUNT:");
		acc.Deposit(amount);
		System.out.println("YOUR PRESENT BALANCE IS: " + acc.balance);
	}
	
	//WITHDRAW	
	public void withdraw(Account acc) {
		System.out.println("ENTER THE AMOUNT:");
		double amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("YOUR PRESENT BALANCE IS: " + acc.balance);
	}
	
	//CHECK DETAILS
	public void checkDetails(Account acc) {
		String name = acc.name;
		double balance = acc.balance;
		System.out.println("DETAILS OF THE ACCOUNT HOLDER:");
		System.out.println("ACCOUNT HOLDER: " + name);
		System.out.println("ACCOUNT BALANCE: " + balance);
	}
	
	//MENU FUNCTION
	public void menu(Account acc) {
		
		while(true) {
			System.out.println("\nLOGGED IN: " + acc.name + " ACCOUNT (" + acc.getAccountType() + ")");
			System.out.println("1] DEPOSIT");
			System.out.println("2] WITHDRAW");
			System.out.println("3] CHECK DETAILS");
			System.out.println("4] LOGOUT");
			System.out.println("CHOOSE YOUT OPTION:");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
				case 1 : deposit(acc);
				break;
				
				case 2 : withdraw(acc);
				break;
				
				case 3 : checkDetails(acc);
				break;
				
				case 4 : System.out.println("THANK YOU!!");
				return;
				
				default:
					System.out.println("ENTER VALID CHOICE");
			}
			
			
		}
		
	}
	
}
