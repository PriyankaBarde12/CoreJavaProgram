package com.interfaceExamples;

public class Mastani implements Juice , IceCream
{
	public void eat()
	{
		System.out.println("Eat the icecream");
	}
	public void drink()
	{
		System.out.println("Drink juice");
	}
	public static void main(String[] args)
	{
		Mastani m =new Mastani();
		m.drink();
		m.eat();
	}

}
