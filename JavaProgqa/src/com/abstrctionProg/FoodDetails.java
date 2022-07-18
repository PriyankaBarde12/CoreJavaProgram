package com.abstrctionProg;

abstract class Food 
{
	String name;
	Food(String nme)
	{
		name = nme;
	}
	abstract void recipe();
	public void ingredient()
	{
		System.out.println("Ingredient of food");
	}
	public void parsel()
	{
		System.out.println("parsel goes " +name);
	}
	
}
class Paratha extends Food
{
	Paratha(String nme)
	{
		super(nme);
		System.out.println("parsel goes " +nme);
		
		recipe();
	}

	public void recipe()
	{
		System.out.println("Paratha recipe ");
	}
}
abstract class Pizza extends Food
{
	Pizza(String nme) 
	{
		super(nme);
		System.out.println("recipe nme "+nme);
	}
	abstract void display();
	public void recipe()
	{
		System.out.println();
	}
}
class Burger extends Pizza
{
	Burger(String nme) 
	{
		super(nme);
		System.out.println("parsel goes " +nme);
		
		display();
	}

	public void display()
	{
		System.out.println("Burgaer recipe ");
	}
}
class Nudules extends Food
{
	Nudules(String nme) 
	{
		super(nme);
		System.out.println("parsel goes " +nme);
		
		recipe();
	}

	public void recipe()
	{
		System.out.println("Nudules recipe ");
	}
}
public class FoodDetails {

	public static void main(String[] args)
	{
		Food f = new Paratha("PuranPoli");
		f.recipe();
		f.ingredient();
		f= new Nudules("nudules");
		f.ingredient();
		f.recipe();
		Pizza p = new Burger("DalBati");
		p.display();
		p.ingredient();
		p.recipe();
		
	}

}
