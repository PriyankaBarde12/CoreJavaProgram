package com.innerclassExample;


public class Society 
{
		int s_regi ;
		String sLocation ;
		static String sName;
		
		public Society(int regi,String name,String location)
		{
			s_regi=regi;
			sName=name;
			sLocation=location;
		}
		private void display()
		{
			System.out.println("RegisterNo : "+s_regi+" \n Society Name : "+sName+" \n Location : "+sLocation);
			Flat f=new Flat(234,"464564735");
			f.showFlat();
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
				System.out.println("Location Society "+Society.sName);
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
			
		
		public static void main(String[] args) 
		{
			
			Society o= new Society(34, "abc", "xyz");
			o.display();
		Flat f= new Society(67,"bb","nkho").new Flat(8,"khbiu");
		f.showFlat();
			
		//	o.mgmtEvent();
		//	o.performTask();
			
			
		}

	}



