package com.exceptionhandling;

import java.util.Scanner;

 class ExampleOverride
{
	public void display(int n)
	{
		System.out.println("...display... "+n);
	}
	
}
class ExampleExcep extends ExampleOverride
{
	public void display(int num)
	{
		try 
		{
			System.out.println("...... "+num);
			
		}
		catch(Exception e)
		{
			System.out.println("Give correct value");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String args[])
	{
		 ExampleOverride obj =new ExampleExcep();
		
		 Scanner sc =new Scanner(System.in);
		 int n =sc.nextInt();
		 obj.display(n);
	}
}
