package com.containmentprog;

public class Market 
{
	private String mname , marea ;
	Shop sh;
	public Market(String name , String area )
	{
		mname= name;
		marea = area;
		sh = new Shop("Grocery SHop " ,"Pune");
	}
	public String ToString() {
		return mname +","+marea+","+sh+
				"\n Shop Details : "+sh;
	}
	/*public String getMname() 
	{
		return marea;
	}
	public String getMarea()
	{
		return marea;
	}
	public Shop getShop()
	{
		return sh;
	}
	public void setMname(String mn)
	{
		mname = mn;
	}
	public void setMarea(String ma)
	{
		marea = ma ;
	}
	public void setShop(Shop shop1)
	{
		sh = shop1 ;
	}*/
	public static void main(String[] args) 
	{
		/*Shop shopObj = new Shop();
		shopObj.setShopName("Market 1");
		shopObj.setShopArea("Pune");
		Market mark = new Market();
		mark.setMname("Markket");
		mark.setMarea("Pune");
		mark.setShop(shopObj);
		System.out.println(mark);*/
		Shop shopObj = new Shop("ABC" ,"XYZ");
		Market mark =new Market("abc" ,"xy");
		System.out.println(mark);
	}

}
