package com.overridingExamples;

class Parent
{
	public Parent()
	{
		System.out.println("pppppppppppp_____________________");	
	}
	public void print()
	{
		System.out.println("_____________________");
	}
}
class Child extends Parent
{
/*	public Parent()
	{
		System.out.println("cccccccc_____________________");
		
	}*/
	public void print()
	{
		System.out.println("_____________________");
	}
}
public class ConstructorCannotOverride {

	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.print();
		Child c =new Child();
		c.print();
	}

}
