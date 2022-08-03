package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CustDetails {

	
	public void display(ArrayList<Customer> l)
	{
		Customer o2=new Customer(9,"pranali",23);
		Customer o3=new Customer(1,"Harish",10);
		l.add(o3);
		l.add(o2);
		l.add(new Customer(3,"Mona",89));
		l.add(new Customer(6,"Riya",44));
		l.add(new Customer(6,"Riya",10));

		Iterator<Customer> itr = l.iterator();
		int count=0;
		while(itr.hasNext())
		{
			Customer cust =itr.next();
			//int min =cust.cAge;
			//if(cust.cAge>20)
			//if(cust.cAge)
			count++;
			System.out.println(cust);
		}
		System.out.println(count);
	}
	public void showAge(ArrayList<Customer> l)
	{
		Iterator<Customer> itr = l.iterator();
		Customer ct =l.get(0);
		int min=ct.cAge;
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			if(min>ct.cAge) {}
		

		}
		System.out.println(ct.cName+"..."+min);
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
	public static void main(String args[])
	{
		ArrayList<Customer> l =new ArrayList<>();
		CustDetails o =new CustDetails();
		o.display(l);
		o.showAge(l);
		o.showMin(l);
		
	}
}
