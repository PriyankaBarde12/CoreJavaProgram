package com.exceptionhandling;

import java.util.Scanner;

public class UncheckedExceptionExamples
{
	public static void showUnchecked(String str , int n)
	{
		String rev="";
		try
		{
			
			for(int i=str.length();i>=0;i--)
			{
				rev =rev+str.charAt(i);
			}
			System.out.println(" Reverse string is : "+rev);
			System.out.println(str.charAt(11));
		}
		catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException | NumberFormatException | ClassCastException  e)
		{
			System.out.println(" Catch Exception goes here ");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any String");
		String s =sc.next();
		System.out.println("Enter any number");
		int n =sc.nextInt();
		showUnchecked(s,n);
	}

}
