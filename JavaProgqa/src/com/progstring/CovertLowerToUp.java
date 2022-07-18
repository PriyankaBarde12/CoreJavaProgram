package com.progstring;

import java.util.Scanner;

public class CovertLowerToUp 
{

	public static void covertString(String str[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string");
		String s = scn.nextLine();
		String newStr= s.toUpperCase();
		System.out.println(newStr);
	}
	public static void main(String[] args) 
	{
		CovertLowerToUp.covertString(args);
		
	}

}
