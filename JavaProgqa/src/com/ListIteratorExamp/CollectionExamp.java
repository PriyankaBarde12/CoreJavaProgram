package com.ListIteratorExamp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExamp 
{

	public static void main(String[] args)
	{
		Collection c1 =new ArrayList();
		c1.add(23);
		c1.add(45);
		Collection c2 =new ArrayList();
		c2.add(23);
		c2.add(45);
		System.out.println(c1.equals(c2));

	}

}
