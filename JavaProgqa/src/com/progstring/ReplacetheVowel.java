package com.progstring;

public class ReplacetheVowel 
{
	public static void replaceVowel(String str)
	{
		//str="aestrwhE";
		//char ch[] ;
		String str2;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='u' || str.charAt(i)=='a')
			{
				
				System.out.println(str);
				
			}
		}
	}
	public static void main(String[] args)
	{
		String str="abcdEfg";
		ReplacetheVowel.replaceVowel(str);
	}

}
