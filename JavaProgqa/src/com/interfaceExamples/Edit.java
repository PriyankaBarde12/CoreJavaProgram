package com.interfaceExamples;

public interface Edit
{
	public float PIE =3.14f;
	void read(String name);
	void update();
	default void write() 
	{
		System.out.println("default method ");
	}
	//protected void display();

}
