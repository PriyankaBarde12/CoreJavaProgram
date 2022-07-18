package com.interfaceExamples;

/*Create class Person with name,address, age with methods getDetails(), ShowDetails().
Create interface TaxPayer with abstract method payTax().
Create class Employee using Person class and TaxPayer.
has empid , basic , hra , da , grossSalary.
 It has constructor to initialize all instance variables, methods to display employee details .
 It also has method calculateSalary().*/

class Person
{
	String name , address;
	int age;
	public void getDetails()
	{
		
	}
	public void showDetails()
	{
		System.out.println("Person name : "+name+" address "+address+" age "+age);
	}
}

public interface TaxPayer
{
	void payTax();
}

class Employee extends Person implements TaxPayer
{
	int empid ;
	float basic ;
	float hra , da , grossSalary;
	public Employee(int empid,float basic,float hra, float da)
	{
		this.empid =empid;
		this.basic =basic;
		this.hra =hra;
		this.da = da;
	}
	public void payTax()
	{
		System.out.println("Pay the tax here");
	}
	public void calculateSalary()
	{
		da = (da * basic)/100;
		hra =(hra * basic)/100;
		grossSalary =basic+da+hra;
		System.out.println("gross Salary of Emp  : "+grossSalary);
	}
}

class Vp extends Employee
{

	public Vp() 
	{
		super(4, 45600, 18, 12);
		super.calculateSalary();
		super.payTax();
		// TODO Auto-generated constructor stub
	}
	public void calculateSalary()
	{
		da = (da * basic)/100;
		hra =(hra * basic)/100;
		grossSalary =basic+da+hra;
		System.out.println("gross Salary of Emp  : "+grossSalary);
	
	}

}