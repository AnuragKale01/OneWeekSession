package com.Bank;

public class customer {

	private int accNo;
	private String name;
	public customer(String name,int accno) {
		this.accNo=accno;
		this.name=name;		
	
	}
	
	public String getName() {
		
		return name;
		
	}
	public int 	getAccNum() {
		return accNo;
	}

}
