package com.overridingExamples;

class Parent1
{
	int sum=200;
	public void print()
	{
		System.out.println("_____________________");
	}
}
class Child2 extends Parent1
{
	int sum=5;
	public void print()
	{
		System.out.println("_____________________");
	}
}

public class VariableCannnotOrid 
{

	public static void main(String[] args) 
	{
		Parent1 p=new Child2();
		System.out.println(p.sum);
	Child2 c=new Child2();
	System.out.println("child  : "+c.sum);
	}

}
