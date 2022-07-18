package com.abstrctionProg;

public class ShopDetails 
{

	public static void main(String[] args)
	{
		PaymentMode p = new NetBanking();
		p.payMode();
		p= new DebitCard();
		p.payMode();
	}

}
