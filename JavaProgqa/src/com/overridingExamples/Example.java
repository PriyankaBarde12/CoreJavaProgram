package com.overridingExamples;
	class FruitsParent 
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
		public void showOverride(String name , int quat)
		{
			System.out.println("parent block goes here "+name+","+quat);
		}
	}
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
		public void showOverride(String n , int q)
		{
			System.out.println("child block goes here "+n+","+q);
		}
	
	}
	 class Dates extends DryFruits
	 {
		 public void showOverride(String n , int q)
			{
				System.out.println("child2 block goes here "+n+","+q);
			}
		
	 }
	 public class Example 
	 {
		public static void main(String args[])
		{
			DryFruits dry = new DryFruits();
			dry.eatIt();
			dry.purchase();
			dry.exportFruits();
			dry.showOverride("abccccc", 4);
			/*_______override ____________*/
			FruitsParent dry2 = new DryFruits();
			dry2.showOverride("Banana", 20);
			DryFruits dry1 = new Dates();
			dry1.showOverride("aaaaaaa", 10);
			
			dry.importFruits();
		}
	}

