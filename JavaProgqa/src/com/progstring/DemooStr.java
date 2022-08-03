package com.progstring;

import java.util.Arrays;

public class DemooStr
{
	
	public static void main(String args[])
	{
		
		String str1 ="java is oops hhhhhhh";
		String a[]=str1.split(" ");
		int freq[] = new int[a.length];
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			freq[i]=1;
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i].equals(a[j]))
				{
					count1++;
					freq[j]=0;
				}
			}
			if(freq[i]!=0)
			{
				freq[i]=count1;
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		/************Split the string************/
		String str2="jjjjjjjj hhhhhh vvvvv aaaa";
		
		String[] ch=str2.split(" "); int cnt=0;
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			cnt++;
		}
		System.out.println(cnt);
		String input = "Java is object oriented programming language";
		  char search = 'a';            
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == 'a' )
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		
	}

}
