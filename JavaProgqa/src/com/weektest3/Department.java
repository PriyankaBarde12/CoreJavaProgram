package com.weektest3;

public class Department
{
	int deptid ; String deptname , managerName;
	public void acceptDep(int deptid , String deptname ,String managerName)
	{
		this.deptid =deptid;
		this.deptname= deptname;
		this.managerName =this.managerName;
	}
	public void showDeptmentDetails()
	{
		System.out.println("Dept Id : "+deptid+ " Dept Name : "+deptname+ " Manager " +managerName);
	}

}
