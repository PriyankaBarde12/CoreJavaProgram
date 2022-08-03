package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		l.add(34);
		l.add(77);
		l.add(12);
		l.add(63);
		l.add(77);
		System.out.println("remove "+l.remove(2));
		System.out.println(l);
		
	}

}
