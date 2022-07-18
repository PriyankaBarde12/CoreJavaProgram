package com.objectarray;

public class Manager
{
	String name ;
	float salary;
	Manager(String name ,float salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
		return "Name : "+name+" Salary : "+salary;
	}

}
