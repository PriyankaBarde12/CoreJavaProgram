package com.recursionExamples;

import java.util.Scanner;

public class Calculate 
{
	
	 int calPower(int ba,int pow)
	{
		if(pow==0)
        		return 1;
    		else 
        		return (ba*calPower(ba,pow-1));	
	}
	public static void main(String args[])
	{
		Calculate obj = new Calculate();
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter base");
    		int b=sc.nextInt();
    		System.out.println("Enter power");
    		int p=sc.nextInt();
    		System.out.println("total : "+obj.calPower(b,p));
    }
	

}
