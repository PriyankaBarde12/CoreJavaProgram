package com.twodiarrray;

import java.util.Scanner;

public class EvenElements
{
	public void showEvenArrayElements(int a[][])
	{
		for (int i=0;i<a.length ;i++)
		{
			for (int j=0; j<a[i].length ; j++)
			{
				if(a[i][j] % 2==0)
					System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public String toString() {
		String str ="Priyanka";
		return str;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How may rows and column ? ");
		int row =sc.nextInt();
		int col=sc.nextInt();
		int a[][]= new int[row][col];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<row;i++)
		{
			for(int j=0 ; j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}	
		}
		EvenElements obj =new EvenElements();
		System.out.println(obj);
		obj.showEvenArrayElements(a);
		sc.close();
		
		
	}

}
