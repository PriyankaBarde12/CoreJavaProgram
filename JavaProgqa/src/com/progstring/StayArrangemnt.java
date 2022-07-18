package com.progstring;

public class StayArrangemnt {
//Aggregation has-a relationship
	public static void main(String[] args) 
	
	{
		Outhouse house =new Outhouse(45 ,"Satara");
		Bangalo b =new Bangalo("100","ABC",house);
		System.out.println(b);
	}

}
