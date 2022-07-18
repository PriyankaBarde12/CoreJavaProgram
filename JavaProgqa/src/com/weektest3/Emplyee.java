package com.weektest3;

import java.util.Arrays;
import java.util.Scanner;

public class Emplyee 
{
	int salary;
	String sname;
	public void emplD()
	{
		
	}
	public void display() 
	{
		String str ="Name : "+sname+ " salary : "+salary;
		//return str;
		
	}
	public static void main(String[] args) 
	{
		Emplyee emp = new Emplyee();
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter emp name");
		String sname =scn.nextLine();
		System.out.println("Enter emp Salary");
		int  salary =scn.nextInt();
		int i ;
		int arr[]=new int[2];
		System.out.println("Show Employee Details");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println(arr[i]);
		emp.display();
	}
	
	
}
