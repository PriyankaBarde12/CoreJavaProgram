package com.interfaceExamples;

class Magazine extends Book implements Edit
{
	Magazine()
	{
		//super(i, n, a);
		super(34,"bbbb","pppppp");
		super.published(aName);
	}
	public void read(String nm)
	{
		System.out.println("Magazine  "+nm);
	}
	public	void update()
	{
		//write();
		System.out.println("Magazine  updated");
	}
	protected void display()
	{
		System.out.println("Magazine details");
	}

}
class Newspaper implements Edit
{
	public void read(String nm)
	{
		System.out.println("Newspaper  "+nm);
	}
	public	void update()
	{
		
		System.out.println("NewPaper  updated");
	}
	public void write()
	{
		System.out.println(".......NewsPaper.....");
	}
	
}
public class PrintingPress {

	public static void main(String[] args)
	{
		Edit e =new Magazine();
		e.read("Sports");
		e.update();
		e.write();
		System.out.println("Variable : "+Edit.PIE);
		
	 	e = new Newspaper();
		e.read("Morning");
		e.update();
		e.write();
		/***********Book class******/
		Book b=new Book(3,"Panipath","AAAA");
		System.out.println(b.toString());
		Magazine mg =new Magazine();
		mg.published("Max");
		mg.read("Sports");
		mg.write();
		mg.update();
	}

}
