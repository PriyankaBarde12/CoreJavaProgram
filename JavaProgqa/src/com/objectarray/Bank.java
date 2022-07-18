package com.objectarray;

import java.util.Arrays;

public class Bank 
{
	public void acceptDetails(Manager[] mg)
	{
		mg[0]= new Manager("ABC",45000.0f);
		mg[1]= new Manager("Shyam" ,35000.0f);
		mg[2] = new Manager("Sonali",3500.0f);
		mg[3]= new Manager("Shyam" ,35000.0f);
		mg[4] = new Manager("Sonali",3500.0f);
	
	}
	public void showMaxSalary(Manager[] mg)
	{
		float max =mg[0].salary;
		for(int i=0;i<mg.length;i++)
		{
			if(max>mg[i].salary)
			//max =mg[i].salary;
			System.out.println(max);
		}
		//System.out.println(max);	
	}
	public void showSalary(Manager[] mg)
	{
		System.out.println(Arrays.toString(mg));
	}
	public static void main(String[] args)
	{
		Manager [] manag ;
		manag = new Manager[5];
		Bank obj =new Bank();
		obj.acceptDetails(manag);
		obj.showSalary(manag);
		obj.showMaxSalary(manag);
	}
}
