package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustDetails 
{
	public void display(ArrayList<Customer> l)
	{
		Customer o2=new Customer(9,"Shri",23);
		Customer o3=new Customer(1,"Harish",40);
		l.add(o3);
		l.add(o2);
		l.add(new Customer(3,"Mona",44));
		l.add(new Customer(15,"Riya",44));
		l.add(new Customer(6,"Riya",29));

		Iterator<Customer> itr = l.iterator();
		int count=0;
		while(itr.hasNext())
		{
			Customer cust =itr.next();
			//int min =cust.cAge;
			//if(cust.cAge>20)
			//if(cust.cAge)
			//count++;
			System.out.println(cust);
		}
	}
	public void changeAge(ArrayList<Customer> l)
	{
		Iterator<Customer> itr = l.iterator();
		
		while(itr.hasNext())
		{
			Customer c =itr.next();
			if("Shri".equals(c.cName))
			{
				c.cAge =44;
				System.out.println(c);
				
			}
		}
		
	}
	public void showOccu(ArrayList<String> l)
	{
		System.out.println("..............");
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals(" "))
				continue;
				int cnt =1;
				for(int j=i+1;j<l.size();j++)
				{
					if(l.get(i).equals(l.get(j))) 
					{
						cnt++;
						l.set(j, " ");
					}
				}
				System.out.println("The name "+l.get(i)+" occure : "+cnt+" times");
		}
	}
	public void showMin(ArrayList<Customer> l)
	{
		Iterator<Customer> itr = l.iterator();
		Customer ct =l.get(0);
		int min=ct.cAge;
		System.out.println(min);
		while(itr.hasNext())
		{
			Customer c=itr.next();
			if(min>c.cAge)
			{
				ct=c;
			}
		}
		System.out.println(ct);
	
	}
	public static void showCosumer(ArrayList<Customer> l)
	{
		System.out.println("...forEach...");
		Consumer<Customer> cust =(str) ->System.out.println(str);
		l.forEach(cust);
		
	}
	//Using Comparable Interface
	public void showSort(ArrayList<Customer> l)
	{
		System.out.println("...sort through customer id ..");
		Collections.sort(l);
		System.out.println(l);
	}
	//Using Comparator Interface
/*	public static void showComparator(ArrayList<Customer> l1)
	{
		System.out.println("Comparete age");
		Collections.sort(l1,new Customer());
		System.out.println(l1);
	}*/
	public static void showFreq(ArrayList<Customer> al) {
	for(int i =0;i<al.size();i++)
	{
		if(al.get(i)==null)
			continue;
		System.out.println(al.get(i)+" occures "+Collections.frequency(al, al.get(i)));
		for(int j =i+1;j<al.size();j++)
		{
			if(al.get(i)!=null && al.get(i).equals(al.get(i)))
				al.set(j, null);
		}
	}
}
	public static void main(String args[])
	{
		ArrayList<Customer> l =new ArrayList<>();
		CustDetails o =new CustDetails();
		o.display(l);
		//o.showAge(l);
		o.showMin(l);
		showCosumer(l);
		//System.out.println("...sort through customer id ..");
		//Collections.sort(l);
		//System.out.println(l);
		ArrayList<String> st =new ArrayList<>();
		o.showOccu(st);
		//o.showSort(l);
		//showComparator(l);
		//showOccu(l);
		showFreq(l);
	}
}
