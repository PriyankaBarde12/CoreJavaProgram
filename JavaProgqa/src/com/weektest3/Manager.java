package com.weektest3;

public class Manager
{
	int manId ,experience ;
	String manName;
	public void acceptDetails(int manId  ,String manName,int experience)
	{
		this.manId=manId;
		this.manName =manName;
		this.experience = experience;
	}
	public void showDetails(Department d)
	{
		System.out.println("Manager id : "+manId+  " Manager Name : "+manName+ " Experience : "+experience);
		d.showDeptmentDetails();
		
	}
	
	public static void main(String[] args) 
	{
		Manager mag =new Manager();
		Department d =new Department();
		mag.acceptDetails(3,"ABC", 5);
		d.acceptDep(7, "Science", "ABC");
		mag.showDetails(d);
	}
}
