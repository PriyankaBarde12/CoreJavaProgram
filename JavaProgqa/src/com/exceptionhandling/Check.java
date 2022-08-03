package com.exceptionhandling;

class InvalidCheckedException extends Exception
{
	public void showExcep()
	{
		System.out.println("InvalidCheckedException generate here");
	}
}

class Check
{
	public void display() throws InvalidCheckedException 
	{
		String s = "Priyankkaaa";
		if(s.length()>8)
		throw new InvalidCheckedException ();
		else 
		System.out.println("string goes..."+s);	
	}
	public static void main(String args[])
	{
		Check obj =new Check();
		try
		{
		obj.display();	
		}
		catch(InvalidCheckedException  e)
		{
			e.showExcep();
		}
	}	
}
