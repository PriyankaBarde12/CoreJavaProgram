package com.inheritanceExamples;
class Aparent
{
	public void showParentsDetails(String name)
	{
		System.out.println("Details of superclass : "+name);
	}
}
class DerivedExample extends Aparent
{
	public void showDerivedClass(String address)
	{
		System.out.println("Derived class "+address);
	}
}
class ChildExample extends Aparent
{
	protected void showChildClass(int age , String bdate)
	{
		System.out.println("age is  "+age+" Bdate : "+bdate);
	}
}

public class HieExample {

	public static void main(String[] args) 
	{
		DerivedExample b =new DerivedExample();
		b.showDerivedClass("Siya");
		b.showDerivedClass("ABC");
		ChildExample c =new ChildExample();
		c.showChildClass(21, "7/7/1992");
		c.showParentsDetails("XYZ");
	}

}
