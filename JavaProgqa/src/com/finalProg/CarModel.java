package com.finalProg;

/*
 Create a class Car with String model and int totalCarSold as static variable. 
 */
public class CarModel {

	static String model="TOYOTO";
	static int totalCarSold= 5;
	public void show( String m , int totalCarSold )
	{
		System.out.println("Model : "+model+" Total: "+totalCarSold);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(CarModel.model);
		System.out.println(CarModel.totalCarSold);
	}

}
