package com.inheritanceExamples;

public class DEmoKidsExample 
{
	public static void main (String args [])
	{
		BigKid big = new BigKid();
		Teenager teen =new Teenager();
		Kid k1 , k2;
		k1=big;
		k2=teen;
		big.readBook(200);
		big.readBook();
		teen.readBook("Panipat");	
	}
}
