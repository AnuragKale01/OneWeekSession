package com.Bank;


	public class Account {
	    private int accountNumber;
	    private double balance;
	    private customer customer;

	    public Account(int accNum, customer customer) {
	        this.accountNumber = accNum;
	        this.customer = customer;
	        this.balance = 0.0; // Initial balance
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrew: " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public customer getCustomer() {
	        return customer;
	    }
	}

