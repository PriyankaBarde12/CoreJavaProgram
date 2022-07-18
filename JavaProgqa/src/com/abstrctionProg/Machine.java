package com.abstrctionProg;

/*Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this 
abstract class Machine and implements method crush. Now, add another 
method filter in the class Juicer. In main method, 
a. Create an object of type Juicer and calls its crush, rotate and filter 
methods. 
b. Create an object of type Juicer with reference variable of Machine 
(Machine m = new Juicer). Check the methods available to m.*/
/*class Mixer which extends the abstract class Machine, has method crush 
implemented and has an additional concrete method blend. In main create an 
object of class of Mixer. Call methods rotate, blend and crush.*/
abstract class Machine 
{
	public void rotate()
	{
		System.out.println("Rotate the machince ");
	}
	abstract void crush();
}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println("Crush juicer fruits in machince");
	}
	public void filter()
	{
		System.out.println("then filter the juice");
	}
}
abstract class Mixer extends Machine
{
	public void crush()
	{
		
	}
	public void blend()
	{
		
	}
}