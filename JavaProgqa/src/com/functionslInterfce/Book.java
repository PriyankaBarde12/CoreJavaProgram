package com.functionslInterfce;

interface DemooExample
{
	void show(int id ,float price);
	default void show() 
	{
		System.out.println(".........");
	}
	static void display(String bName) 
	{
		System.out.println("book name : "+bName);
	}
}
public class Book 
{
	
	public void showBookname()
	{
		DemooExample.display("Panipat");
	}
	public static void main(String[] args) 
	{
		DemooExample book =(id,price)->{ 
			System.out.println("Book id is "+id+"\n price "+price);
		};
		book.show(2, 400);
		book.show();
		Book b=new Book();
		b.showBookname();
	}

}
