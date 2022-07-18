package app.prog;

import java.util.Scanner;
public class OddString 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str =sc.nextLine();
		String s = "";
		int i ;
		for(i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
			
				s += str.charAt(i);
				
			}
		}
		System.out.println(s);
	}

}
