package com.inheritanceExamples;

class Account
{
	int accId;
	float balance;
	String custName;
	public void openAccount(float amt1 , String nme)
	{
		//System.out.println(id);
		System.out.println(amt1+" ,"+nme);
	}
	public void showDetails()
	{
		System.out.println("Account ID : "+accId+" Balance : "+balance+" Customer Name : "+custName);
	}
	Account(){}
	Account(String sn,float bal)
	{
		sn= custName;
		bal = balance;
	}
}
class SavingAccounts extends Account
{
	float iRate;
	public void openAccount(float a , String n)
	{
		System.out.println("Amount open to acc "+a+" Name : "+n);
	}
	public SavingAccounts(float i)
	{
		super();
		 iRate =i;
		
	}
	public SavingAccounts(float ir , int accid ,float b ,String ctName)
	{
		super("Priyanka", 10000);
		ir =iRate;
		accId = accid;
		balance = b;
		custName = ctName;
	}
	public void showSavingAccDetails()
	{
		showDetails();
		System.out.println("interst Rate : "+iRate);
	}
	public void depositeAmmount(float amt)
	{
		balance+=amt;
		System.out.println("Total Account Balance : " +balance);
	}
	public void withdrawAmmount(float amt)
	{
		balance -= amt;
		System.out.println("after withdrawing Amount : "+balance);
		
	}
}

public class Bank 
{

	public static void main(String[] args) 
	{	SavingAccounts obj2 = new SavingAccounts(5.5f, 6, 10000, "Priyanka");
		obj2.showSavingAccDetails();
		obj2.depositeAmmount(300.0f);
		obj2.withdrawAmmount(100.0f);
		obj2.openAccount(400, "xyz");
		Account acc = new SavingAccounts(8.8f);
		acc.openAccount(500, "ABC");
	}

}
