package com.exceptionhandling;

public class ErrorException {

	public static void main(String[] args) {
		int a=29;
		int b=0;
		try
		{
			int div =a/b;

			System.out.println("Division : "+div);
		}
		catch(Exception e)
		{
			System.out.println(" Donnot divide by zero");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error msg : "+e.getMessage());
		}
	}

}
