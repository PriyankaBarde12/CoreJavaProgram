package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionTypes
{
	public static void main(String[] args) 
	{
		//StringIndexOutOfBoundException
		/*String str = "gdfj";
		for(int i =0;i<str.length();i++)
		{
				System.out.println(str.charAt(6));
			
		}*/
	
		
		////ArrayIndexOutOfBoundException
	/* int arr[] = new int[5];
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[10]);
	 }*/
		
		
		//ClassCastException
	/* String s2 ="hellooo";
	 Object o=s2;
	 Integer i = (Integer) o;*/
		
		
		//java.lang.NumberFormatException
	// int a=Integer.parseInt("45adsd78");
		
		
	  //InputMisMatchException
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter Number");
	  int s =sc.nextInt();
	}
}
