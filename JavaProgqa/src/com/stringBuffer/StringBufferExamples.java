package com.stringBuffer;

public class StringBufferExamples {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("KKKK");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
