package com.twodiarrray;

import java.util.Arrays;
import java.util.Scanner;

public class Inventory
{

	int i;
		public void acceptDetails(Item itm[])
		{
			itm[0] = new Item("Pen",5 ,67);
			itm[1] = new Item("Book",1 ,67);
			itm[2] = new Item("Notebook",2 ,500);
			itm[3] = new Item("pencil",10 ,67);
			itm[4] = new Item("pen",5 ,400);
			
		
		}
		public void maxCost(Item itm[])
		{
			for(int i=0;i<itm.length;i++)
			{
				//max=itm[i].cost;
				if(itm[i].cost > 200)
				{
					System.out.println(itm[i].cost);
				}else 
				{
					System.out.println("_______________");
				}
			}
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
			iv.maxCost(itm);
			
			//Item it1 =new Item();
		}

}


