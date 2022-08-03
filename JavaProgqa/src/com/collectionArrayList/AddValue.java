package com.collectionArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddValue
{
	public static void addData()
	{
		List l=new ArrayList();
	System.out.println(l.size());
		l.add(2345);
		l.add("priyanka");
		l.add(34.9);
		l.add(2);
		System.out.println(l);
		System.out.println(l.size());
	}
	public static void main(String[] args) 
	{
		addData();
	}

}
