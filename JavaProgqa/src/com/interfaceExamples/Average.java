package com.interfaceExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) throws IOException 
	{
		/*Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int sum=0;
		float avg=0.0f;
		int cnt=0;
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				sum=sum+a[i];
				cnt++;
				System.out.println(sum);
			}
			
		}*//*
		for(int i=0;i<a.length;i+=2)
		{
			sum+=a[i];
			cnt++;
		}
		avg = sum/cnt;
		System.out.println(avg);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		
		int num = Integer.parseInt(inp);
		String outp ="1";
		
		int fact = 1;
		int count= 2;
		System.out.print(outp);
		while(true)
		{
			fact=fact*count;
			if(fact > num)
			{
				break;
			}
			outp = " "+fact;
			count++;
			System.out.println(" "+outp);
		}
	
	}

}
