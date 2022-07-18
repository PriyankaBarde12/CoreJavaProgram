package com.weektest3;

import java.util.Scanner;

public class CalculateTemp 
{
	public static void main(String args[]) 
	{
	   Scanner in = new Scanner(System.in);
	   double temp[] = new double[30];
	        int n = temp.length;
	        
	        System.out.println("Enter daily temperatures:");
	        for (int i = 0; i < n; i++) {
	            temp[i] = in.nextDouble();
	        }
	        
	        double sum = 0.0;
	        int low = 0 ;
	        for (int i = 0; i < n; i++) {
	            
	        	 if (temp[i] < temp[low])
	                 low = i;     
	            sum += temp[i];
	        } 
	        System.out.println("lowest temp day = " + (low + 1));
	    }
	}


