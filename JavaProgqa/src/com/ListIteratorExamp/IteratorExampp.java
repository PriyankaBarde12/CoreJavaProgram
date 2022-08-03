package com.ListIteratorExamp;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExampp {

	public void show(ArrayList<String> l)
	{
		System.out.println("..after removing...iter..");
		
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
		
		
	}

	public static void main(String[] args) 
	{
		IteratorExampp o =new IteratorExampp();
		ArrayList<String> li = new ArrayList<>();
		li.add("priya");
		li.add("Ahujaaa");
		li.add("Shyam");
		li.add("siyaaa");
		System.out.println(li);
		
		o.show(li);
	}

}
