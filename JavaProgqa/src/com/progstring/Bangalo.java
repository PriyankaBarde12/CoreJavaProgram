package com.progstring;

public class Bangalo 
{
	String totArea , ownerName;
	Outhouse out;
	Bangalo(String t ,String n,Outhouse o)
	{
		totArea =t;
		ownerName =n;
		out =o;
	}
	public String toString()
	{
		return totArea+","+ownerName+","+out;
	}

}
