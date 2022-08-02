package com.progstring;
import java.util.Scanner;

public class ReverseStr
{
	public void showSubString(String str)
	{
	String s2 = "Good Morning" ;
	String s1 =" soo";
		String s = str.substring(3,10);
		System.out.println("SubString of String : ");
		System.out.println(s);
	}
	public void showOccurance()
	{
		String str="Java is a object oriented prog";
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			ch[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					
				}
			}
		}
	/* int[] freq = new int[str.length()];    
        int i, j;    
            
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        for(i = 0; i <str.length(); i++) {    
            freq[i] = 1;    
            for(j = i+1; j <str.length(); j++) {    
                if(string[i] == string[j]) {    
                    freq[i]++;    
                        
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
        }    
            
        //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
    } */   	
	}
	public void showRep() {
		String s2 = "Java " ;
		String s1 =" Language";
		String s3 =s2+s1;
		String s6="hello";
		int i;
		System.out.println(s3);
		/*************/
		String emptystr="";
		for( i=0;i<s2.length();i++)
		{
			emptystr +=s2.charAt(i);
		}
		for( i=0;i<s1.length();i++)
		{
			emptystr +=s1.charAt(i);
		}
		System.out.println(emptystr);
		
	}
		public void remove(String st) 
		{
		}
		
	public static void cocateString(String str1 ,String str2)
	{
		System.out.println(str1.concat(str2));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		char ch[]  =str.toCharArray();
		int i; 
		System.out .println("Reverse string : ");
		for(i=ch.length-1 ; i>=0;i--) 
		{
			System.out.print(str.charAt(i)+",");
		}
		ReverseStr sub =new ReverseStr();
		System.out.println();
		sub.showSubString("Good Morning");
		ReverseStr.cocateString("Java is ", "Object Oriented Programming Lang");
		
		String s2 = "Good " ;
		String s1 =" day";
		String s3 =s2+s1;
		System.out.println(s3);
		
	/********* copy ***********/
		String newstr =new String();
		for( i=0;i<s2.length();i++)
		{
			 newstr += s2.charAt(i);
			
		}
		System.out.println("New String :" +newstr);	
		/***********/
		String s4  =s3.replace(s2, "Mon");
		System.out.println(s4);
		ReverseStr obj =new ReverseStr();
		obj.showRep();
		obj.remove("hello");
		sc.close();
	}

}
