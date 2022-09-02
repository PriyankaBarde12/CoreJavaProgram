package com.progstring;

import java.util.Scanner;

public class CountOccu 
{
	public static void show()
	{
		String s="priyankaa";
		int arr[] =new int[256];
		for(int i=0;i<s.length();i++)
		{
			arr[(int)s.charAt(i)]++;
			
		}
		for(int j=0;j<s.length();j++)
		{
			if(arr[j]!=0)
				System.out.println((char)j+ "-->" +arr[j]);
		}
	}

	public static void main(String[] args) 
	{
		String str;  
		int i, len = 0;  
		int counter[] = new int[256];  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");   
		str = scanner.nextLine();  
		len = str.length();  
		for (i = 0; i < len; i++)   
		{  
				counter[(int) str.charAt(i)]++;  
		}  
		for (i = 0; i < 256; i++)   
		{  
				if (counter[i] != 0)   
				{       
					System.out.println((char) i + " --> " + counter[i]);  
				}  
		}
		show();
		//CountOccu();
	}

}
