package com.containmentprog;

public class Outhouse 
{
		private int keyno;
		private	String area;
	 Outhouse(int k ,String a)
	{
		keyno =k;
		area = a;
	}
	 
	public String toString()
	{
		return keyno +","+area;
	}
	public int getKeyno()
	{
		return keyno;
	}
	public String getArea()
	{
		return area;
	}
	public void setKeyno(int key)
	{
		keyno = key;
	}
	public void setArea(String ar)
	{
		area = ar;
	}

}
