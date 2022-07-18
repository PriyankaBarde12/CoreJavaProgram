package com.overridingExamples;

class Book
{
	public void readBook(String bname)
	{
		System.out.println("Book1 "+bname);
	}
}
class Book2 extends Book
{
	public void readBook(String nm)
	{
		super.readBook(nm);
		System.out.println("Book2 Name is "+nm);
	}
}
class Book3 extends Book2
{
	public void readBook(String bookName)
	{
		super.readBook(bookName);
		System.out.println("Book3  is "+bookName);
	}
}
public class OverridingExample
{
	public static void main(String[] args)
	{
		Book book =new Book2();
	//	book.readBook("Panipat");
		book=new Book3();
		book.readBook("Bharari");
	}

}
