package com.arrayprograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int	arr[] = {3, 90, 45, 29, 37, 78};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		
		}
		show();
		checkArr();
	}
	public static void show()
	{
		int a[] = { 30, 60, 40 };
		  
        int b[] = {30, 60, 40 };
  
        boolean result = Arrays.equals(a, b);
  
        if (result == true) {
            System.out.println("Two arrays are equal");
        }
        else {
      
            System.out.println("Two arrays are not equal");
        }

	}
	public static void checkArr()
	{
		int arr1[]= {7,3,6,90,10};
		int arr2[]= {7,3,6,90,10};
		boolean result =true;
		if(arr1.length ==arr2.length)
		{
			for(int i=0;i<arr1.length; i++)
			{
				if(arr1[i]!= arr2[i])
				{
					result= false;
				}
				
			}
		}
		else 
		{
			result = false;
		}
		if(result==true)
			System.out.println("arrays are equal");
		else
			System.out.println("arrays not equals");
	}
	
	
}
