package com.ListIteratorExamp;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenIterator33 
{
	public void showIterator(ArrayList<Integer> l)
	{
		
	
		Iterator<Integer> ite =l.iterator();
		//while(ite.hasNext())
		for(ite =l.iterator();ite.hasNext();ite.next())
		{
			Integer n =ite.next();
			if(n%2==0)
			{
				ite.next();
			}	
		}
		System.out.println(l);
		}
	public static void main(String[] args)
	{
		ArrayList<Integer> li = new ArrayList();
		for(int i=1;i<=50;i++)
		{
				li.add(i);
		}
		System.out.println(li);
		EvenIterator33 o =new EvenIterator33();
		o.showIterator(li);
	}

}
