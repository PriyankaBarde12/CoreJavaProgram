package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException
{
	FileInputStream fis ;
	public void readFile() throws IOException
	{
		
		
			fis =new FileInputStream("F:\\A.java");
				int ch =fis.read();
				ch=fis.read();
				System.out.println(ch);
				
		
		/*try
		{
			fis =new FileInputStream("F:\\Myclass.java");
				int ch =fis.read();
				System.out.println("file read here");
		}
		
		catch(FileNotFoundException f)
		{
			System.out.println("file not available in this folder");
			System.out.println("Exception type "+f.getClass());
			System.out.println("Error Message "+f.getMessage());
		}
		finally {
			System.out.println("I am in finally block");
		}*/
	}
	public static void main(String args[]) throws IOException
	{
		FileException obj =new FileException();
		obj.readFile();
	}
}