package com.recursionExamples;

public class Recursionprog 
{
	static 	int cnt=1;
	public void display()
	{
		if(cnt<=5)
		{
			System.out.println("Hello " + cnt);
			cnt++;
			display();
		}
	}
	public void display(int cnt)
	{
		if(cnt<=5)
		{
			System.out.println("Hello " + cnt);
			cnt++;
			display(cnt);
		}
	}
	
	public static void main(String[] args) 
	{

		Recursionprog obj = new Recursionprog();
		obj.display(1);
	}
}
