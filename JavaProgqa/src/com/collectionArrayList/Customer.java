package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer
{
	int custId , cAge;
	String cName;
	public Customer(int id ,String n,int age)
	{
		custId=id;
		cName =n;
		cAge=age;
		
	}
	public String toString()
	{
		return "Id:" +custId+" Name "+ cName +" age : "+cAge;
	}
	

}
