package com.interfaceExamples;

public class Book
{
	int bid;
	String bName ; String aName;
	Book(int i ,String n,String a)
	{
		 bid =i;
		bName =n;
		aName =a;
	}
	public void published(String publication)
	{
		System.out.println("Publication:  "+publication);
	}
	public String toString()
	{
		return "Bid : "+bid+"BookName  "+bName+"Author "+aName;
	}
	
}
