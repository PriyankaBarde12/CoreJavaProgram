package com.innerclassExample;

abstract class ClubHouse
{
	abstract public void conductGames(String eventName);
}


interface Decorate
{
	void makeDecorate();
	}

public class AnonymonuousInnerClass 
{
	
		int s_regi ;
		String sLocation ;
		static String sName;
		
		private void display()
		{
			System.out.println("RegisterNo : "+s_regi+" \n Society Name : "+sName+" \n Location : "+sLocation);
		}
		class Flat
		{
			int flatNo;
			String mobno;
			Flat(int no ,String mob)
			{
				flatNo= no;
				mobno = mob;
			}
			public void showFlat()
			{
				System.out.println("Flat No "+flatNo+" Mobno "+mobno);
			}
		}
		class Audit
		{
			int auditNum;
			static String area;
			Audit(int a,String ar)
			{
				auditNum =a;
				area =ar;
			}
			public void doAudit()
			{
				System.out.println("Audit number "+auditNum);
			}
			public static void showAudit()
			{
				System.out.println("Area : "+area);
				System.out.println("Location Society "+AnonymonuousInnerClass.sName);
			}
		}
			public void mgmtEvent()
			{
				//new ClubHouse
				ClubHouse c=new ClubHouse()
						{

							@Override
							public void conductGames(String eventName) {
								System.out.println("Conduct games "+eventName);
							}
					
						};c.conductGames("FOOTBALL");
						
			}
			public void performTask()
			{
				Decorate d=	new Decorate()
				{

					@Override
					public void makeDecorate() 
					{
						System.out.println("Decorate here");
						showDecorate();
					}
					public void showDecorate()
					{
						System.out.println("Decorate details here");
					}
					
				};d.makeDecorate();
				
			}
			public void displayShop()
			{
				SocietyShop shop=new SocietyShop()
				{

					@Override
					public void countShop() 
					{
						System.out.println("Number of Shops ");
						SocietyShop.showName("Fashion");
					}
					
				};
				shop.countShop();
				
			}
		
		public static void main(String[] args) 
		{
			
			 AnonymonuousInnerClass o= new  AnonymonuousInnerClass();
			o.mgmtEvent();
			o.performTask();
			o.displayShop();
			
			
		}

	}



