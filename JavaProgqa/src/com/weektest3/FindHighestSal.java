package com.weektest3;

import java.util.Arrays;



public class FindHighestSal 
{
	public void acceptDetails(Emp emp[])
	{
		emp[0] = new Emp("Pavan",50000);
		emp[1] = new Emp("ABC",20000);
		emp[2] = new Emp("Nita",5500);
		emp[3] = new Emp("perana",1015);
		emp[4] = new Emp("Sima",25200);	
	
	}
	public void showHighest(Emp emp[])
	{
		int max = 0; int i;
		for( i=0;i<emp.length;i++)
		{
			if(emp[i].salary >max)
	               max = emp[i].salary;
		}
		System.out.println("Highest salary of emp : " +max);
	}
	public void display(Emp emp[])
	{
		System.out.println(Arrays.toString(emp));
	}
	public static void main(String args[])
	{
		Emp emp [];
		emp = new Emp[5];
		FindHighestSal obj = new FindHighestSal();
		obj.acceptDetails(emp);
		obj.display(emp);
		obj.showHighest(emp);
	}

}
