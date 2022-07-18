package com.overridingExamples;

import java.util.Arrays;

class Team
{
	String tname;
	int noOfPlayers;
	String ownerName;
	Member[] mbs;
	public void selectTeam(String tname)
	{
		System.out.println("Team Name "+tname);
	}
	public void showTeam(Member[] mbs)
	{
		mbs[0]= new Member(2,"Sachin",45,300); 
		mbs[1]= new Member(2,"Sachin",45,300); 
		System.out.println(Arrays.toString(mbs));
	}
	
}
class Member extends Team
{
	int mid;
	String mName;
	int mAge ;
	int noOfMatchesPlayed;
	Member(int m ,String nm,int a ,int no)
	{
		mid = m;
		mName = nm;
		mAge = a;
		noOfMatchesPlayed = no;
	}
	public void selectTeam(String mName)
	{
		System.out.println("Team Name "+mName);
	}
	
public String toString()
{
	String str1 = 	"Member Id : "+mid+" Name "+mName+" Age "+mAge+ " No of Matches " +noOfMatchesPlayed;
	return str1;
	
}
}
public class ShowTeam 
{
	Member m;
	Team t = new Member(0, null, 0, 0);
	
	Member mem =new Member(0, null, 0, 0);
	

}
