package com.overridingExamples;

class Car
{
	String company ;
	public void drive(String name , int speed)
	{
		System.out.println();
	}
}
class AcCar extends Car
{
	public void drive(String name , int speed)
	{
		System.out.println("Ac Car goes here "+name+","+speed);
	}

}
class Ecar extends Car
{
	public void drive(String name , int speed)
	{
		System.out.println("Ecar goes here "+name+","+speed);
	}
}
public class DynamicPolyExample
{
	public void showInstanceOfObject(Car c)
	{
		if(c instanceof AcCar)
			c.drive("TOYOTO" , 67);
		else if(c instanceof Ecar)
			c.drive("Nexa",55);
	}

	public static void main(String[] args) 
	{
		DynamicPolyExample d = new DynamicPolyExample();
		Car co = new AcCar();
		co.drive("Priyanka", 120);
		co = new Ecar();
		co.drive("PQR", 130);
		d.showInstanceOfObject(co);
		
	}

}
