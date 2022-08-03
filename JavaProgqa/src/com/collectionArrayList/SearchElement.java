package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement 
{
	public void searchEle(ArrayList<Integer> l)
	{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==4)
			{
				System.out.println("Element is available");
			}
			else
				System.out.println("not search");
		}
	}

	public static void main(String[] args) 
	{
		SearchElement o =new SearchElement();
		ArrayList<Integer> l= new ArrayList();
		l.add(56);
		l.add(45);
		l.add(8);
		l.add(2);
		l.add(0);
		
		o.searchEle(l);
	}

}
