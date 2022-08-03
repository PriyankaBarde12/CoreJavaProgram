package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ColorArrList 
{
	public static void AddColor(Collection c)
	{
		System.out.println(c);
		if(c.isEmpty())
			System.out.println("Empty list");
		else 
			System.out.println("Not empty list");
		System.out.println("\n count : "+c.size());
	}

	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		c.add("White");
		c.add("YELLOW");
		c.add("Red");
		c.add("Black");
		c.add("Pink");
		c.add("A");
		
		c.add("Red");
		c.add("Black");
		c.add("Pink");
		c.add("A");
		c.add("Red");
		c.add("Black");
		c.add("Pink");
		c.add("A");
		
		AddColor(c);

	}

}
