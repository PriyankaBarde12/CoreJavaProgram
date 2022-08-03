package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpDetails 
{
	public void showEmp(ArrayList<Employee1> l)
	{
		l.add(new Employee1(2,"Tina",30000.0f));
		l.add(new Employee1(3,"Sachin",25000.0f));
		Employee1 e =new Employee1(4,"Riya",10000.0f);
		l.add(e);
		l.add(new Employee1(4,"kavita",7000.0f));
		l.add(new Employee1(23,"ABC",30000.0f));
		System.out.println(l);
		/*if(e.salary>10000.0f)
		{
			System.out.println(e);
		}*/
	}
	public static void maxSalary(ArrayList<Employee1> l)
	{
		System.out.println("....Maximum Salary....");
		Iterator<Employee1> itr = l.iterator();
		Employee1 e =new Employee1(); 
		float maxsalary=0;
		while(itr.hasNext())
		{
			  e = itr.next();
			if(maxsalary<=e.salary)
			{
				maxsalary=e.salary;
				System.out.println(e.empName+" Salary : "+ maxsalary);	
			}
		}	
	}
	public static void minSalary(ArrayList<Employee1> l)
	{
		System.out.println("...Minimum Salary.....");
		Iterator<Employee1> itr = l.iterator();
		Employee1 e =new Employee1(); 
		float min =0;
		float maxsalary=0;
		while(itr.hasNext())
		{
			  e = itr.next();
			if(maxsalary<=e.salary)
			{
				maxsalary=e.salary;	
			}
			else if(min<maxsalary)
			{
				min=e.salary;
				System.out.println(e.empName+" Salary : "+ min);
			}
		}
	}
	public static void showLessthan(ArrayList<Employee1> l)
	{
		System.out.println(".................");
		Iterator<Employee1> itr =l.iterator();
		Employee1 emp = new Employee1();
		while(itr.hasNext())
				{
					emp =itr.next();
					if(emp.salary<10000.0f || emp.empName =="Sachin" )
					{
						System.out.println("....less than 10000 Salary...."+"\n"+emp.empName+" Salary : "+ emp.salary);
					}
				
					
				}
	}
	public static void main(String[] args) 
	{
		ArrayList<Employee1> l =new ArrayList();
		EmpDetails emp =new EmpDetails();
		emp.showEmp(l);
		maxSalary(l);
		minSalary(l);
		showLessthan(l);
	}

}
