package com.stringBuffer;

public class SbExample2 {

	public static void main(String[] args) 
	{
		StringBuffer sb1 =new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.length());
		sb1.append("Hi");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		sb1.append("How are you");
		System.out.println(sb1);
		//System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.append("Pune");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(40);
		
	}

}
