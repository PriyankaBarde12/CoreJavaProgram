package com.collectionArrayList;

import java.util.ArrayList;

public class ArrListAssign1 {
// without using Generic 
	public void showArray()
	{
		ArrayList l1 =new ArrayList();
		l1.add(567);
		l1.add(89);
		l1.add(23);
		l1.add(33);
		System.out.println("Intger arrlist : "+l1);
		ArrayList l2 =new ArrayList();
		l2.add("Payal");
		l2.add("Rutuja");
		l2.add("Prakash");
		l2.add("hello");
		System.out.println("String List2 : "+l2);
	}
	public static void main(String[] args) 
	{
		ArrListAssign1 o =new ArrListAssign1();
		o.showArray();
	}

}
