package com.inheritanceExamples;

/*4.	Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int.
 *  Create getter, setter methods for the variables. In main method, 
1> create Laptop object 
2> set values of variables noOfUSBPort, processorSpeed using setter methods. 
3> print variables noOfUSBPort, processorSpeed using getter methods.*/
public class Laptop 
{
	int noOfUSBPor;
	int  processorSpeed;
	public int getNoOfUSBPor()
	{
		return noOfUSBPor;
	}
	public void setNoOfUSBPor(int n)
	{
		noOfUSBPor = n;
	}
	public int getProcessorSpeed()
	{
		return processorSpeed;
		
	}
	public void setProcessorSpeed(int p)
	{
		processorSpeed =p;
	}
	public void display()
	{
		System.out.println( "ProcessorSpeed : "+processorSpeed+" NoOfUSBPor : "+noOfUSBPor);
	}
	public static void main(String args[])
	{
		Laptop obj = new Laptop();
		obj.setNoOfUSBPor(10);
		obj.setProcessorSpeed(80);
		obj.display();
		System.out.println(obj.getNoOfUSBPor());
		System.out.println(obj.getProcessorSpeed());
	}
	
}
