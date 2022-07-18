package com.overridingExamples;

class Employee
{
	int empid;
	String name;
	float sal;
	public double calculateSal(double amt)
	{
		return amt;
		
	}
}
class HR extends Employee
{
	HR(){}
}
class Developer extends Employee
{
	int skillAllowances;
	Developer(int i)
	{
		
	}
	public int getSkillAllowances()
	{
		return skillAllowances;
	}
}
class Manager extends HR
{
	Manager(float bonus)
	{
		
	}
}

public class DisplayDetails {

	public static void main(String[] args)
	{
		
	}
	

}
