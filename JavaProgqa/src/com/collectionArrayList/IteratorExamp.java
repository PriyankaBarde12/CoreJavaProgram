package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExamp 
{
	public static void show(ArrayList<String> l)
	{
		
		System.out.println("...Iterator...");
		Iterator<String> itr =l.iterator();

		for(itr=l.iterator();itr.hasNext();itr.next())
		{
			if(l.size()>5)
			{
				itr.remove();
			}

		}
		System.out.println(l);
	}
	public void showList(ArrayList<String> l)
	{
		l.add("Hellooo");
		l.add("Good");
		l.add("morning");
		System.out.println(l);
		
		Iterator<String> itr =l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.length()>5)
			{
				itr.remove();
			}
		}
		System.out.println(l);	
		/*ListIterator<String> litr = l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}*/
		
}
	public void show22List(ArrayList<String> listt)
	{
		
	}
	public static void main(String[] args) {
		//Iterator it;
		//Iterator it;
		ArrayList<String> l=new ArrayList<>();
		
		IteratorExamp o =new IteratorExamp();
		o.showList(l);
		show(l);
	}

}
