package com.weektest3;

import java.util.Arrays;

public class FirstFiveEven 
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	public void display() 
	{
		for(int i=0; i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args)
	{
		FirstFiveEven even = new FirstFiveEven();
		even.display();		
	}

}
