package com.twodiarrray;
import java.util.Scanner;

import com.arrayprograms.TwoDArray;

public class SquareofArr
{
	int a[][];
		public void showSquareOfElements(int a[][])
	{
		for (int i =0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length ;j++)
			{
				 a[i][j]=a[i][j]*a[i][j];
				 System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void showArray(int a[][]) 
	{
		for(int i=0 ;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +  " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
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
		TwoDArray obj =new TwoDArray();
		System.out.println("Array : ");
		obj.showArray(a);
			System.out.println("Square of Arrays : ");
		obj.showSquareOfElements(a);
		sc.close();

	}


}
