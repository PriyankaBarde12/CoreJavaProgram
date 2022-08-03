package com.linkListCollection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Examp1
{
	public static void show(LinkedList l)
	{
		
		ListIterator li= l.listIterator();
		System.out.println(li.hasPrevious());
		while(li.hasNext())
		{
			li.next();	
		}
		System.out.println(l);
		System.out.println(li.hasPrevious());
		
	}

	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		l.add(23);
		l.add(89);
		l.add(9);
		l.add(5);
		show(l);
	}

}
