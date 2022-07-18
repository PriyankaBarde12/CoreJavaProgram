package com.arrayprograms;


public class TwoDarr
{
	public static void display(int arr[][])
	{
		int arr1[][] = {{1,2},{6,7}};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void shoTransp()
	{
		System.out.println("_____________________");
		int arr1[][] = {{1,2},{6,7}};
		int tranp[][]=new int[2][4];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				tranp[i][j]=arr1[j][i];
				System.out.print(tranp[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{int a[][] = null;
		TwoDarr.display(a);
		TwoDarr.shoTransp();
	}

}
