package com.overridingExamples;

class Bank
{  
	String comp;
	int speed;
	Bank(String c)
	{
		comp = c;
	}
	public static void getInstance()
	{
		System.out.println("Static goes here ");
	}
	int getRateOfInterest()
	{
		return 0;
	}  
}  
 
class SBI extends Bank
{  
	public  SBI(int s ,String c)
	{
		super(c);
		super.speed= s;
		
	}
	public static void getInstance()
	{
		System.out.println("override it ");
	}
	int getRateOfInterest()
	{
		return 2;
	}  
}  
  
class ICICI extends Bank
{  
	ICICI(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	int getRateOfInterest()
	{
	
		return 4;
	}  
}  
class AXIS extends Bank
{  
	AXIS(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	int getRateOfInterest()
	{
		return 6;
	}  
}  

public class BankExample 
{
	public static void main(String[] args)
	{
	/*	SBI sbi=new SBI();  
		ICICI ici=new ICICI("ABC");  
		AXIS axis =new AXIS();  
		System.out.println("SBI Rate of Interest: "+sbi.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+ici.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+axis.getRateOfInterest()); */ 
	}

}
