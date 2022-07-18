package com.containmentprog;

public class Shop
{
	private String shopName ,shopArea;
	public Shop(String a , String ar)
	{
		shopName =a;
		shopArea = ar;
	}
	public String toString()
	{
		return "Shop Name :"+shopName +" Shop Area : "+shopArea;
	}
	/*public String getShopName()
	{
		return shopArea;
	}
	public String getShopArea()
	{
		return shopArea;	
	}
	public void setShopName(String shopN)
	{
		shopName =shopN;
	}
	public void setShopArea(String shopA)
	{
		shopArea = shopA ;
	}*/
}
