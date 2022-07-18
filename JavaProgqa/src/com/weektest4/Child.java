package com.weektest4;

class Student
{
	String sname ="Riya";
	public void showName()
	{
		System.out.println("Name "+sname);
	}
}
public class Child extends Student{

	int sid=12;
	public void display()
	{
		System.out.println(sid);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Child c= new Child();
c.display();
c.showName();
Student s =new Student();
	}

}
