package com.objectarray;

public class Item 
{
	String name;
	int num ;
	int cost;
	public Item(String n ,int q ,int c)
	{
		name =n;
		num =q;
		cost= c;
		
	}
	public String toString() 
	{
		String str ="ItemName" +name +"Quatity "+num + " cost : "+cost;
		return str;
		
	}
	public void demo() {
		System.out.println("ItemName" +name +"Quatity "+num + " cost : "+cost);
		
	}
	public boolean equals(Object obj)
	{
		if(obj==null) 
			return false;
		if(this==obj)
			return true;
		return false;
		
	}

}
