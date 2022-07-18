package com.containmentprog;

public class StayArrangemnt 
{
	//Aggregation has-a relationship
		public static void main(String[] args) 
		
		{
			Outhouse house =new Outhouse(45 ,"XYZ");
			house.setKeyno(567);
			house.setArea("Mumbai");
			
			Bangalo b =new Bangalo(451.2f,"ABC",house);
			b.setOwnerName("Riya Patel");
			b.setTotArea(100.23f);
			b.setOut(house);
			System.out.println(b);
			/*************Composition *******************/
			Bangalo	b2 = new Bangalo("Priyanka");

			b2.setTotArea(100.23f);
			b2.setOut(house);
			
			System.out.println(b2);
		}


}
