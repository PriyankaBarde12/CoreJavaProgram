package com.markerInterface;

import java.util.Scanner;

class Product implements Cloneable
{
	 int pid;String pname;
	 public Product(int pid,String pname)
	 {
		 this.pid=pid;
		 this.pname =pname;
	 }
	 public void showDetails()
	 {
		 System.out.println("Product ID : "+pid);
		 System.out.println("Product name : "+pname);
	 }

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter product id ");
		int pid=sc.nextInt();
		System.out.println("Enter product name ");
		String pname =sc.next();
		System.out.println("...............Product Details............");
		Product p1 =new Product(pid,pname);
		Product p2=(Product)p1.clone();
		p2.showDetails();
		
	}

}
