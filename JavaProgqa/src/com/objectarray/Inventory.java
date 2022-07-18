package com.objectarray;
import java.util.Arrays;

public class Inventory 
{
	public void acceptDetails(Item itm[])
	{
		itm[0] = new Item("Pen",5 ,200);
		itm[1] = new Item("Book",2 ,67);
		itm[2] = new Item("Notebook",5 ,500);
		itm[3] = new Item("pencil",1 ,15);
		itm[4] = new Item("rubber",25 ,200);	
	
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
	public void findAverage(Item itm[])
	{
		int sum=0;
		for(int i=0;i<itm.length ;i++)
		{
			sum+=itm[i].cost;
		}
		System.out.println("Average of cost : "+sum/itm.length);
	}
	public void findSameCostof(Item itm[])
	{	int i;
	
	int match = itm[0].cost ;
		for( i=0; i<itm.length ; i++)
		{
				match=itm[i].cost;				
			
		}
		System.out.println("Match Pen item cost : "+match );
	}
	public void display(Item itm[])
	{
		System.out.println(Arrays.toString(itm));
	}
	public static void main(String args[])
	{
		Item itm [];
		itm = new Item[5];
		Inventory iv= new Inventory();
		iv.acceptDetails(itm);
		iv.display(itm);
		iv.aboveCost(itm);
		iv.maxCost(itm);
		iv.minCost(itm);
		iv.findAverage(itm);
		iv.findSameCostof(itm);
		Item ob1 = new Item("cloth", 2, 700);
		Item ob2 =new Item("cloth", 2, 700);
		//ob1=ob2;
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1==ob2);
		
	}



}
