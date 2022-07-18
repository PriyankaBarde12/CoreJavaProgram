package com.finalProg;
 class FinalDemo
{
	int x,z;
	public final void method2(int x)
	{
		
	}
	public final void method2(int y, int z) 
	{
		final int x=45;
		System.out.println(x);
	} 
}
class CHildfinal extends FinalDemo
{
	public void childMethod()
	{
		super.method2(x,z);
		System.out.println("child goes here.............");
	}
	public final void method2(float z) 
	{
		final int x=45;
		System.out.println(x);
	}
}
 class DemoFinalExample {

	public static void main(String[] args) 
	{
		CHildfinal c =new CHildfinal();
		c.childMethod();
	}

}
