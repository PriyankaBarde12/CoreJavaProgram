package com.progstring;

public class ExampleOfString 
{
	public static void main(String[] args) 
	{
	String str ="abba";
	String rev = "";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev = rev+ str.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println("String is pali");
	}
	else 
		System.out.println("String is not pali");	
	}

}
