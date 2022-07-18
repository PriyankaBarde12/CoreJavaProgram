package com.containmentprog;

/*class FruitsParent 
{
	String color , taste;
	float price;
	public void eatIt()
	{
		System.out.println("Enjoy eating");
	}
	public void purchase()
	{
		System.out.println("purchase it");
	}
}*/
 class DryFruits extends FruitsParent
{
	float wholeSale;
	String grade;
	public void exportFruits()
	{
		System.out.println("Export from UK");
	}
	public void importFruits() 
	{
		System.out.println("import fruits");
	}
}
public class Fruits
{
	public static void main(String args[])
	{
		DryFruits dry = new DryFruits();
		dry.eatIt();
		dry.purchase();
		dry.exportFruits();
		dry.importFruits();
	}
}
