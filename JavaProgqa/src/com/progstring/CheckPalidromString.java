package com.progstring;

import java.util.Scanner;

public class CheckPalidromString 
{
	Scanner sc =new Scanner(System.in);

	public void checkString(String str[])
	{
		String s  = "";
		String rev = "";
		System.out.println("Enter string");
		s= sc.nextLine();
		for(int i =s.length()-1 ;i>=0 ; i--)
		{
			rev = rev + s.charAt(i);		
		}
		if(s.equals(rev))
			System.out.println("String is palidrome");
		else
			System.out.println("String is not palidrom");
	}
	
	public static void main(String[] args) 
	{
		CheckPalidromString  obj = new CheckPalidromString ();
		obj.checkString(args);

	}

}
