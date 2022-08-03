package com.innerclassExample;

public class A 
{
	int a;
	String name;
	class B
	{
		public void display()
		{
			System.out.println("inner class B goes here ");
		}
	}
	public void show()
	{
		System.out.println("A goes here");
	}

	public static void main(String[] args) 
	{
		A o =new A();
		A.B obj2 = o.new B();
		obj2.display();
		o.show();
		
		
	}

}
