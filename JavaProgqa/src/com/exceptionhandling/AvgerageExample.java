package com.exceptionhandling;

import java.util.Scanner;

public class AvgerageExample
{
	public void displayAvgerage(int arr[])
	{
		int sum=0;int avg = 0;
		try 
		{
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
				avg =sum/arr.length;
			}
			System.out.println("Average of Number : "+avg);
		}
		catch(Exception e)
		{
			System.out.println("length is max then array Length");
		}
	}

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i] =sc.nextInt();
		}	
		AvgerageExample avg =new AvgerageExample();
		avg.displayAvgerage(arr);
	}

}
