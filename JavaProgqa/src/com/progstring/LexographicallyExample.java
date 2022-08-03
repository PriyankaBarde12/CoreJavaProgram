package com.progstring;

import java.util.Scanner;

public class LexographicallyExample {

	public static boolean doValidMobno(String mobno)
	{
		boolean res =mobno.matches("[0-9][0-9]/d{10}" );
		return res;
	}
	public static void main(String[] args) {
		String s="HELLO";
		String s2="HelLO";
		String s3="HELLO";
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		String s11="Today is Tuesday";
		String ss =new String("Today is Tuesday");
		
		System.out.println("String Comparison");
		System.out.println(s11.equals(ss));
		System.out.println(s11==ss);
		System.out.println(s11==ss.intern());
		
				/*if(s.compareTo(s2)>0)
				{
					System.out.println("s is greater");3
				}
				else if(s.compareTo(s2)<0)
				{
					System.out.println("s is greater");
				}*/
		/**********Regular Expression *****************************************************************/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String  m=sc.next();
	
			if(doValidMobno(m))
			{
				System.out.println("valid mobNo");
			}
			else 
			{
				System.out.println("wrong Mobile Number");
			}
		}
}
