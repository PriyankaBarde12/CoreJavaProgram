package com.interfaceExamples;

class Base 
{
	public final void show() 
	{
		System.out.println("Base::show() called");
	}
}
class Derived extends Base 
{
	/*public void show()
	  {
		System.out.println("Derived::show() called");
		}*/
}
public class Main11 
{
	public static void main(String[] args) 
	{
		Base b = new Derived();
		b.show();;
	}
}