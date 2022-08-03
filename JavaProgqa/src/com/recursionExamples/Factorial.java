package com.recursionExamples;

public class Factorial 
{
	int calFact(int num)
	{    
		  if (num == 0)    
		    return 1;    
		  else    
		    return(num * calFact(num-1));    
	}    
	public static void main(String args[])
	{  
			Factorial obj =new Factorial();
			System.out.println("Factorial : "+obj.calFact(5));    
	}  

}
