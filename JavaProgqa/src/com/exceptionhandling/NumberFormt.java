package com.exceptionhandling;

public class NumberFormt 
{
	public static void show()
	{
		try 
		{
			String s1 ="uehfuih";
			Object o =s1;
			int num =(Integer) o;
		}
		catch(NumberFormatException | ClassCastException e)
		{
			System.out.println("Give the correct value");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args)
	{
		NumberFormt.show();
	}

}
