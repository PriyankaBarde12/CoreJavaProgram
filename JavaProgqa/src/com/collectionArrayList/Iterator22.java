package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator22 
{
	public static void showIterator(ArrayList<Integer> l)
	{
		Iterator itr =l.iterator();
		for(itr =l.iterator();itr.hasNext();itr.next())
		{
			itr.hasNext();
		}
		System.out.println(l);
	}
	public static void showforEach(ArrayList<Integer> lit)
	{
		System.out.println("....foreach goes.....");
		for(int i :lit)
			System.out.print(i+" ");
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> li =new ArrayList();
		li.add(56);
		li.add(23);
		li.add(200);
		li.add(4);
		showIterator(li);
		showforEach(li);
	}

}
