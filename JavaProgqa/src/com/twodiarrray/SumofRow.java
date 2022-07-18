package com.twodiarrray;

import java.util.Scanner;

public class SumofRow {

	public static void main(String[] args)
	{
		int i ,j ,row, col;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row :  ");
		row = sc.nextInt();
		System.out.println("Enter column :  ");
		col = sc.nextInt() ;
		int a[][] = new int[row][col] ;
		System.out.println("Enter array elements : ");
		for(i=0 ;i<row ;i++)
		{
			for (j=0 ;j<col ;j++)
			{
				a[i][j] =sc.nextInt();
			}
			
		}
		System.out.println("Sum of Each Row Elements ...");
		for( i=0;i<a.length;i++)
		{
			int sum=0;
			for( j=0;j<a[i].length;j++)
			{
				sum += a[i][j];
			}
			System.out.println(" Row Elements sum is "+ sum);
		}

	}

}
