package com.exceptionhandling;

class AgeNotApplicableException extends RuntimeException
{
	public void getInfo()
	{
		System.out.println("Vaccine not allow");
	}
}
class Person
{
	int age  ; String name,aadhar ;
	public Person(int a ,String aadh ,String n)
	{
		age=a;
		aadhar=aadh;
		name=n;
	}
	public void checkEligibility()
	{
		if(age>=60)
		{
					System.out.println(name+" Eligible for vaccine  ");	
		}
		else
		{
			throw new AgeNotApplicableException();
		}
	}
	public String toString()
	{
		return "Person Name :"+name+" age "+age+" AAdhar no "+aadhar;
	}
	
	public static void main(String[] args)
	{
		Person p =new Person( 78 ,"103808203876","Riya");
		try {
				p.checkEligibility();
			}
		catch(AgeNotApplicableException e)
		{
			e.getInfo();
		}
		/***********show person Details*********/
		System.out.println(p);
	}

}
