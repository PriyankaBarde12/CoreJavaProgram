package com.inheritanceExamples;

/*5.	Create class IPLTeam with method play. Create child classes of IPLTeam called as CSK, RCB.
 *  In main, call play from child class objects.*/
 
 class IPLTeam
 {
	 public void play( String name)
	 {
		 System.out.println("IPL team");
	 }
 }
 class CSK extends IPLTeam
 {
	 public void play( String n)
	 {
		 super.play(n);
		 System.out.println("CSK team "+n);
	 }
 
 }
 class RCB extends IPLTeam
 {
	 public void play( String nm)
	 {
		 System.out.println("RCB team "+nm);
	 }
 
 }
public class IplDetails
{
	 
	public static void main(String[] args) 
	{
		IPLTeam ipl = new CSK();
		ipl.play(null);
	}

}
