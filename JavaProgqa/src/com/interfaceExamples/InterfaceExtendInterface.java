package com.interfaceExamples;

public class InterfaceExtendInterface implements Interface1,Interface3,Interface2
{

	public void show()
	{
		System.out.println("interf1________________");
	}
	public void pay() 
	{
		show1(2,4);
		System.out.println("interf2________________");
	
	}
	public void display() 
	{

		System.out.println("interf3________________");
	
	}
	public static void main(String[] args) {
		Interface2 inter = new InterfaceExtendInterface();

		inter.display();
		inter.show();
	//	inter.show1(10,3);
		inter.pay();
	}

}
