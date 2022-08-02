package com.overridingExamples;

class Vehicle
{
	public void run(String speed)
	{
		System.out.println("Vehicle speed is "+speed);	
	}
}
public class Bike extends Vehicle
{
	public void run(String name)
	{
		System.out.println("Bike goes here "+name);
	}

	public static void main(String[] args) 
	{
		//Vehicle v=new Bike();
		//v.run("540");
		Bike bike = new Bike();
		bike.run("Splender");
		Vehicle veh = new Vehicle();
		veh.run("180");
	}

}
