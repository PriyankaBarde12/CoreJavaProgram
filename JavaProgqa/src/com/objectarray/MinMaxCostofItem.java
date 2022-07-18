package com.objectarray;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxCostofItem
{
	public void acceptDetails(Item itm[])
	{
		/*itm[0] = new Item("Pen",5 ,6);
		itm[1] = new Item("Book",2 ,67);
		itm[2] = new Item("Notebook",5 ,500);
		itm[3] = new Item("pencil",1 ,7);
		itm[4] = new Item("pen",25 ,400);*/
		int arr[] =new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Item name");
		String name =sc.nextLine();
		System.out.println("Enter Item quatity");
		int num= sc.nextInt();
		System.out.println("Enter item price");
		int cost = sc.nextInt();
		System.out.println("Display Details ");
		for(int i =0; i<itm.length ;i++)
		{
			itm[i].name =sc.nextLine();
			itm[i].num= sc.nextInt();
			itm[i].cost = sc.nextInt();
			arr[i] =sc.nextInt();
			
			
		}
	
	}
	public void aboveCost(Item itm[])
	{
		System.out.println("Display Item price above 200 : ");
		for(int i=0;i<itm.length;i++)
		{
			if(itm[i].cost > 200)
			{	
				System.out.println(itm[i].cost);
			}
		}
	}
	public void maxCost(Item itm[])
	{
		int max = 0;
		for(int i=0;i<itm.length;i++)
		{
			if(itm[i].cost >max)
	               max = itm[i].cost;
		}
		System.out.println("Maximum price of Item : " +max);
	}
	public void minCost(Item itm[])
	{
		int min = itm[0].cost ;
		for(int i=0 ;i<itm.length ;i++)
		{
			if(min > itm[i].cost)
				min=itm[i].cost ;
		}
		System.out.println(" Item Min Price : " +min);
	}	
	public void display(Item itm[])
	{
		System.out.println(Arrays.toString(itm));
	}
	public static void main(String args[])
	{
		Item itm [];
		itm = new Item[5];
		 MinMaxCostofItem iv= new  MinMaxCostofItem();
		iv.acceptDetails(itm);
		iv.display(itm);
		iv.aboveCost(itm);
		iv.maxCost(itm);
		iv.minCost(itm);
		//Item it1 =new Item();
	}
}
