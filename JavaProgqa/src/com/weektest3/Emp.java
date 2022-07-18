package com.weektest3;

public class Emp 
{
	String ename;
	int salary;
	public Emp(String name ,int s)
	{
		ename =name;
		salary =s;	
	}
	public String toString() 
	{
		String str ="Emp name : " +ename +" Salary "+ salary ;
		return str;
		
	}

}
