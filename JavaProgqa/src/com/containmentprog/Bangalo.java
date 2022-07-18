package com.containmentprog;

public class Bangalo
{
	private  float totArea ;
	private String ownerName;
	Outhouse out;
	Bangalo(float t ,String n,Outhouse o)
	{
		totArea =t;
		ownerName =n;
		out= o;
	}
	public Bangalo(String ow)
	{
		ownerName = ow;
		out = new Outhouse(45,"pune");
	}
	public String toString()
	{
		return totArea+","+ownerName+
				"\n shop compo : "+out;
	}
	public float getTotArea()
	{
		return totArea;	
	}
	public String getOwnerName()
	{
		return ownerName;		
	}
	public Outhouse getOut()
	{
		return out;	
	}
	public void setTotArea(float tot)
	{
		totArea = tot;
	}
	public void setOwnerName(String own)
	{
		ownerName = own;
	}
	public void setOut(Outhouse ou)
	{
		out = ou;
	}



}
