package com.enumExamp;


enum Days
{
	MON,TUES,WED,THUR,FRI,SAT,SUN
}
public class EnumExamp {

	public static void main(String[] args)
	{
		Days d = Days.THUR;
		switch(d)
		{
			case MON :
			case TUES :
			case WED :
			case THUR :
			case FRI :System.out.println("Working days ");
				break;
			case SAT :System.out.println("Today is Week End");
				break;
			default : System.out.println("Today is HoliDay");
				break;
		}
	}

}
