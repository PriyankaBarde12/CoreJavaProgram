package com.interfaceExamples;

interface X
{
	void methodX();
}
class A implements X
{
	public void methodX() {}
/*void methodX() //Cannot reduce the visibility of the inherited method from X
{
System.out.println("Method X");
}*/
}