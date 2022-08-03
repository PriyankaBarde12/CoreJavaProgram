package com.enumExamp;
enum Seasons
{ SPRING , SUMMER, AUTUMN } 

public class SeasonDetails 
{

	public static void main(String[] args) {
		Seasons	 s =Seasons.SPRING;
		switch(s)
		{
		case SPRING : System.out.println("Its Spring");
		break;

		case SUMMER : System.out.println("Its SUMMER");
		break;

		 default : System.out.println("Its AUTUMN");
		break;
		}
	}

}
