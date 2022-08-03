package com.innerclassExample;

import com.innerclassExample.Society1.Audit;

public class StaticInnerClass
{
	public static void main(String[] args) 
	{
		
		/*Society1 o= new Society1();
		o.mgmtEvent();
		o.performTask();
		Society1.Audit Aud = new Audit(45,"Laxmi area");
		Aud.doAudit();*/
	
	}

}
 class Society1
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
	static class Audit
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
		
		public static void main(String args[])
		{
			Society1 o= new Society1();
			o.mgmtEvent();
			o.performTask();
			Society1.Audit Aud = new Audit(45,"Laxmi area");
			Aud.doAudit();
	
		}
}

