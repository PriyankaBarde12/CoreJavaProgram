package com.interfaceExamples;

public interface Interface1
{
	void show();
	default void show1(int n1 ,int n2)
	{
		System.out.println(n1*n2);
	}

}
interface Interface3
{
	void pay();
	static void showw() 
	{
		System.out.println("Interface3 goes here");
	}
}
 interface Interface2 extends Interface1,Interface3
{
	 void display();
}
