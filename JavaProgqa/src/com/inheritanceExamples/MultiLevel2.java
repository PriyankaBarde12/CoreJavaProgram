package com.inheritanceExamples;


class Calculator
{
	public float showAddition(float a ,float b)
	{
		return a+b;
	}
}
class DemoSubst extends Calculator
{
	
	public DemoSubst() {
		
		
	}
	public int showSubstraction(int a , int b)
	{
		return a-b;
	}
}
class MultExample extends DemoSubst
{
	public double showMultiplication(double a, double b)
	{
		return a*b;
	}
	public MultExample()
	{
		
	}
}
public class MultiLevel2
{
	public static void main(String[] args)
	{
		MultExample o =new MultExample();
	System.out.println(	o.showAddition(240.34f, 11.2f));
	System.out.println(	o.showSubstraction(25, 5));
	System.out.println(	o.showMultiplication(500, 10));
		
	}

}
