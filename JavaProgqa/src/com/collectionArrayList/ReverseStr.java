package com.collectionArrayList;

import java.util.ArrayList;

public class ReverseStr 
{
	public static void addData(ArrayList<String> li )
	{
		li.add("java");
		li.add("object oriented");
		li.add("ABCde");
		li.add("Helloo");
		System.out.println(li);
		System.out.println(li.getClass());
		
	}
	public static void reverseString()
	{
		System.out.println(".....ReverseStr String goes here....." );
		ArrayList l = new ArrayList();
		l.add("good morning");
		l.add("Monday");
		l.add("collection");
		for(int i=l.size()-1;i>=0;i-- )
		{
			System.out.println(l.get(i));
		}
	}
	public static void evenNum(ArrayList<Integer> it)
	{
		/*it.add(121);
		it.add(34);
		it.add(88);
		it.add(3);
		it.add(4);*/
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				it.add(i);
			}
		}
		System.out.println(it);
	}
	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList();
		addData(l);
		reverseString();
		ArrayList<Integer> ite =new ArrayList<>();
		evenNum(ite);
	}

}
