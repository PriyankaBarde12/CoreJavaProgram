package com.markerInterface;

public class ExampleofNestedinterf implements NestedInterface.NestedMessage,NestedInterface
{
	public void msg() ///nested interface
	{System.out.println("helloo nested interface");}
	
	public void show() //outer interface method
	{
		System.out.println("outer interface...........");
	}

	public static void main(String[] args)
	{
		NestedInterface.NestedMessage message = new ExampleofNestedinterf();
		message.msg();
		NestedInterface outer =new ExampleofNestedinterf();
		outer.show();
	}

}
