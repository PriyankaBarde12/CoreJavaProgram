package com.collectionArrayList;

public class Employee1 
{
	int empId;
	String empName;
	float salary;
	public Employee1(int id ,String name ,float s)
	{
		empId=id;
		empName =name;
		salary =s;
	}
	public Employee1() {
		
	}
	public String toString()
	{
		return "Emp Id : "+empId+" Name : "+empName+" Salary :"+salary+"\n";
	}

}
