package com.ayush.project.atm;

import java.util.*;

public class Operations {
	
	Map<Integer, Account> account = new HashMap<>();
	
	public Operations() {
		account.put(1010, new SavingAccount("Ayush Acharya", 1510, 2000));
		account.put(1020, new CurrentAccount("Jeevan Shetty", 1015, 3000));
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME TO JAVA ATM");
		
		while(true) {
			
			System.out.println("ENTER YOUR ACCOUNT NUMBER");
			System.out.println("want to exit click yes/y");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y" )) {
				System.out.println("GOOD BYE!!");
				break;
			}
			
			int accno = Integer.parseInt(input);
			
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
			
			sc.close();
			System.out.println("WELCOME!!");
			
		}
	}
	
}
