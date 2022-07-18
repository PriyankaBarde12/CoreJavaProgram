package com.overridingExamples;

class ElecDevice 
{
	int qty ;
	float itemPrice;
	ElecDevice()
	{
		int qty =1 ; 
		float itemPrice = 10000.0f;
	}
	public void empData()
	{
		System.out.println("parente method goes here");
	}
	protected void doSale(int qty , float itemPrice)
	{
		empData();
		System.out.println("Parent");
	}
}
class Tv extends ElecDevice
{
	Tv()
	{
		super();
	}
	public void tvData() {
		super.doSale(qty, itemPrice);
	}
	protected void doSale(int qty , float itemPrice)
	{
		//empData();
		tvData();
		System.out.println("Tv Details qty "+qty+" price "+itemPrice);
	}
}
class WashingMachince extends ElecDevice
{
	public void doSale(int q , float i)
	{
		System.out.println("WashingMachine Details qty "+q+" price "+i);

	}
}
class Fridge extends ElecDevice
{
	public void doSale(int qt , float price)
	{
		empData();
		System.out.println("Fridge Details qty "+qt+" price "+price);
	}
}

public class ShowElectronicDevice {

	public static void main(String[] args)
	{
		ElecDevice device = new Tv();
		device.doSale(1, 5000);
		device = new WashingMachince();
		device.doSale(1, 30000.0f);
		device = new Fridge();
		device.doSale(2, 60000);
		
	}

}
