package com.abstrctionProg;

abstract class PaymentMode 
{
	abstract void payMode();
	
}
class NetBanking extends PaymentMode
{

	protected void payMode()
	{
		System.out.println("Payment through NetBanking ");
	}
	
}
class DebitCard extends PaymentMode
{
	protected void payMode()
	{
		System.out.println("Payment through DeditCard ");
	}
}