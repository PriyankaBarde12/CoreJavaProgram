package com.progstring;

import java.util.Arrays;

public class SplitStringExamp 
{
	public static void splitString()
	{
		String str1="Javaisoobis";
		//String[] str = str1.split("");
	//	System.out.println(Arrays.toString(str));
		for(int i=0;i<str1.length();i++)
		{
			int count =0;
			for(int j=0;j<str1.length();j++)
			{
				if(i>j && str1.charAt(i)==str1.charAt(j))
				{
					count++;
					continue;
					
				}
				//if(str1.charAt(i)==str1.charAt(j))
					//break;
			}
			if(count==0)
			System.out.println(str1.charAt(i));
		}
		
		
		//System.out.println(a);
	}
	public static void main(String[] args) 
	{
		SplitStringExamp.splitString();
	}

}
