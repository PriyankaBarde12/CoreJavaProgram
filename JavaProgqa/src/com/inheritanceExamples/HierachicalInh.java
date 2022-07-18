package com.inheritanceExamples;

class Employee
{
	String empName ,empDesignation ;
	 public int empId;
	 public Employee()
	 {
		 System.out.println("Parent default constr");
	 }
	 public Employee(int a)
	 {
		 System.out.println(a);
	 }
	 public Employee(String area) 
	 {
		 System.out.println("Area : "+area);
	 }
	 public void empDetails(String empName ,String empDesignation ,int empId)
	{
		 System.out.println("Name "+empName +" Designation "+empDesignation +" \nId "+empId);
	}
}
class Developer extends Employee
{
	float salary;
	public Developer() 
	{
		super(34);
	}
	public void showTask(float salary)
	{
		
		System.out.println(" salary "+salary);
	}
}
class Tester extends Employee
{
	public Tester()
	{
		super("Pune");
	}
	public void displayWork(String wName)
	{
		System.out.println("Emp wname : "+wName);
	}
}

public class HierachicalInh 
{
	public static void main(String[] args)
	{
		Developer dev =new Developer();
		dev.empDetails("Manali", "Developer", 6);
	
		dev.showTask(25000f);

		Tester test =new Tester();
		test.empDetails("ABC", "Tester", 23);
		test.displayWork("Accept details");
		
	}
}
