package com.functionslInterfce;

public interface Service 
{
	void provideService(String name);
	default void show(int n) 
	{
		System.out.println("service.....*********......."+n);
	}
}
