package app.prog;

import java.util.Scanner;

/*Q5. Create array of Employee type with size 5.						[4]
Employee class has empId,empNAme,salary properties.		
a.	Display record of employee with highest salary.		
b.	Display record of employees with salary above 60000.		
c.	Display record of employees with salary same as salary of Manoj.	
d.	Display average salary of all employees.	
*/
public class Employee 
{
	int empId;
	float salary;
	String empName;
//	int arr[]= new int[5];
	int i;
	public Employee(int id,float sal,String name)
	{
		empId =id;
		salary =sal;
		empName =name ;
	}
	public String toString()
	{
		String str = " id : "+empId+" salary : "+salary+" Emp Name : " +empName;
		return str;
	}
	
}
