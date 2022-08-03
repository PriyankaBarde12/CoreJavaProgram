package com.progstring;

import java.util.Arrays;

public class SplitStringExamp 
{
	public static void splitString()
	{
		String str1="fhduyv cnb jxix kvbcijid";
		String[] str = str1.split(" ");
		System.out.println(Arrays.toString(str));
		
		//System.out.println(a);
	}
	public static void main(String[] args) 
	{
		SplitStringExamp.splitString();
	}

}
