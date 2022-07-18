package com.inheritanceExamples;

class Area
{ 
	public void calAreaofRectangle(int l , int b)
	{
		System.out.println("Area of Rect : " +(l*b));
	}
	public void calAreaSquare(int side)
	{
		System.out.println("Square Area : " +side);
	}
	
}
class Circle extends Area
{
	public void calArea(float r)
	{
		System.out.println("Area of Circle : "+3.14*r);
	}
}

public class SingleInh 
{
	public static void main(String[] args) 
	{
		Circle obj = new Circle();
		obj.calAreaofRectangle(20, 10);
		obj.calArea(2);
		obj.calAreaSquare(4);
		
		
	}

}
