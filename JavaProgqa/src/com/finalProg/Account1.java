package com.finalProg;

public class Account1 
{
	int accId;
	String holderName;
	float balance;
	static final int ifsccode = 3456708;
	Account1()
	{
		
	}	
	Account1(int accId, String holderName,float balance)
	{
		this.accId =accId;
		this.holderName = holderName;
		this.balance =balance;
	//	this.ifsccode = ifsccode;
		
	}
	public static void changeInterestRate(float iRate)
	{
		
	}
	public void showAccountDetails()
	{
		System.out.println("accId "+accId+"holder "+holderName+" Balance "+balance);
	}
	public static void main(String[] args) 
	{
		System.out.println(Account1.ifsccode);
	}

}
