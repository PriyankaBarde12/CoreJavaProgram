package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class UsingIterator {

	public static void main(String[] args) 
	{
		ArrayList l =new ArrayList();
		l.add(23);
		l.add(78);
		l.add(89);
		Iterator itr =l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	
	}

}
