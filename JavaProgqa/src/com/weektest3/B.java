package com.weektest3;

public class B
{
	static int add(int a,int b)
	{
		return a+b;
	}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
	} 
	public static void main(String[] args)
	{  
		System.out.println(B.add(40,110));  
		System.out.println(B.add(51,10,60)); 
	} 

}