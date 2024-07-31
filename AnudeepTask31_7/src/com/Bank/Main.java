package com.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a customer
    	Scanner sc=new Scanner(System.in);
    	
boolean flag=true;
		customer c1 = null;
		Account account = null;
		int accNum = 0;
		while(flag) {
			
			System.out.println("--------------------Welcome to SBI-----------------");
	    	System.out.println("1.Create Account:");
	    	System.out.println("2.Deposit");
	    	System.out.println("3.Withdraw");
	    	System.out.println("4.Account Details");
	    	System.out.println("5.Exit");
System.out.println("please Enter Your Choice:");
	    	
	    	int choice=sc.nextInt();	
			
	    	if(choice==1) {
	    	System.out.println("Enter Your Name");
	    	String name=sc.next();
	    	System.out.println("Enter Your Account Number:");
	    	accNum=sc.nextInt();
	    	 c1= new customer(name, accNum);
	    	
	    	}
	    	if(choice==2) {
	    		
	    		System.out.println("Enter Your Deposit Amount:");
	    		double deposit=sc.nextDouble();
	    		
	    		account= new Account(accNum, c1);
	    		account.deposit(deposit);
    	
		}
	    	if(choice==3) {
	    		System.out.println("Enter Withdraw Amount:");
	    		double withdra=sc.nextDouble();
	    		account.withdraw(withdra);
	    	}
	    	if(choice==4) {
	    		
	    		System.out.println("Balance: " + account.getBalance());
	            
	            // Print customer information
	            System.out.println("Customer Name: " + account.getCustomer().getName());
	            System.out.println("Customer Account Number: " + account.getCustomer().getAccNum());
	    	}
	    	if(choice==5) {
	    		flag=false;
	    	}
	    		
		}
    	
    	
    	
    	
    	
        
        
        
        
        
        
        
        // Print balance
        
    
}
}
