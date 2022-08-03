package com.progstring;

import java.util.Scanner;

public class CountSumofDigit 
{
	public static void sumofDigit(String str)
	{
		//String str ="java2347ahdg7892";
		char ch[] =str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.println("digits "+ch[i]);
				System.out.println();
				int n=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+n;
				
			}
		}
		System.out.println("Sum : "+sum);
	}
	public static void display(String str2)
	{
		int sum=0;
		for(int i=0;i<str2.length();i++)
		{
			if(str2.charAt(i)>='0' && str2.charAt(i)<='9')
			{
				sum = sum+Integer.parseInt(String.valueOf(str2.charAt(i)));
			}
		}
		System.out.println("sum : "+sum);
	}
	public static void main(String args[])
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter String here.............");
		String str =scn.next();
		CountSumofDigit.sumofDigit(str);
		System.out.println("..........................");
		CountSumofDigit.display(str);
		scn.close();
	}

}
