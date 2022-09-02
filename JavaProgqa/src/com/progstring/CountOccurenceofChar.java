package com.progstring;

import java.util.Scanner;

public class CountOccurenceofChar
{
	public static void showOccu()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter your String");
		String str = sc.nextLine();
		str=str.replace(" ", ""); //removing white space
		for(int i=0 ; i<str.length();i++)
		{
			int count =0;
			for(int j=0; j<str.length() ; j++)
			{
				if(j<i && (str.charAt(i) == str.charAt(j)))
					break;
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			if(count!= 0)
				System.out.println(str.charAt(i)+"---> " +count +" times");
		}
	}
	public static void main(String args[])
	{
		showOccu();
	}
}
