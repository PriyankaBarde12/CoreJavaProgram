package com.inheritanceExamples;

class Woman
{
	public String height;
	protected int age = 22 ;
	public void displayDetails()
	{
		System.out.println("Parent class goes here");
	}

}
class WorkingWoman extends Woman
{
	public void show()
	{
		System.out.println("WorkingWoman here");
	}
}
class Girl extends WorkingWoman 
{
	public void showMulti()
	{	
		System.out.println("Derived class  ");
		System.out.println("Girl age : "+age);
	}
}
public class MultiLevelExample
{
	public static void main(String[] args) 
	{
		Girl obj = new Girl ();
		obj.displayDetails();
		obj.show();
		obj.showMulti();
		
		
		
		
	}

}
