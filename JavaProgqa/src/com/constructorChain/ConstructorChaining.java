package com.constructorChain;

public class ConstructorChaining
{
	int rollno ;
	String name;
	float percentage ;
	ConstructorChaining()
	{
		rollno = 101 ;
		name = "Priyanka";
		percentage = 71.01f;
	}
	ConstructorChaining(String name)
	{
		this.name = name;
	}
	ConstructorChaining(int rollno ,String name,float percentage)
	{
		this(name);
		this.rollno = rollno;
		//this.name = name ;
		this.percentage = percentage;
	}
	public void display()
	{
		System.out.println("Roll no : "+rollno+" Name : "+name+" percentage : "+percentage);
	}
	public static void main(String[] args) 
	{
		ConstructorChaining chain =new ConstructorChaining();
		chain.display();
		ConstructorChaining chain2= new ConstructorChaining(34,"ABC" ,78.8f);
		chain2.display();
		
	}

}
