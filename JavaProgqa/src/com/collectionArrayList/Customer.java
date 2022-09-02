package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Customer implements Comparable<Customer>  ,Comparator<Customer>//
{
	int custId , cAge;
	String cName;
	public Customer(int id ,String n,int age)
	{
		custId=id;
		cName =n;
		cAge=age;
		
	}
	public Customer() {}
	public String toString()
	{
		return "Id:" +custId+" Name "+ cName +" age : "+cAge;
	}
	//using Comparable
	public int compareTo(Customer c) 
	{
		if(this.cAge<c.cAge)
		return 1;
		else if(this.cAge>c.cAge)
			return -1;
		else 
		
			if(this.cName.compareTo(c.cName)<0)
				return 1;
	
			else if(this.cName.compareTo(c.cName)>0)
			return -1;
			else 
				return 0;
	}
	public boolean equals(Customer o)
	{
		return true;
		
	}
	//By using comparator
	public int compare(Customer c1 ,Customer c2)
	{
		/*if(this.cAge<c2.cAge)
			return 1;
			else if(this.cAge>c2.cAge)
				return -1;
			else {return 0;}*/
		if(this.custId<c2.custId)
			return -1;
			else if(this.custId>c2.custId)
				return 1;
			else {return 0;}
		
			
		
		//return c1.cAge+c1.cAge;
	}
	

}
