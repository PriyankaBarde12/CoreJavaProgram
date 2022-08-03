package com.ListIteratorExamp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListitrExamp 
{
	public static void showItr(ArrayList<Integer> n)
	{
		//Iterator itr =n.iterator();
		
		ListIterator<Integer> lite = n.listIterator();
		System.out.print(lite.hasPrevious() +" ");

		while(lite.hasNext())
		{
			System.out.print(lite.next()+" ");
		}
		//	boolean a =lite.hasPrevious();
		System.out.println(lite.hasPrevious());
		
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> l =new ArrayList<>();
		l.add(69);
		l.add(364);
		l.add(20);
		l.add(55);
		System.out.println("List1 : "+l);
		showItr(l);
	}

}
