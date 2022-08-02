package com.abstrctionProg;
abstract class Shape
{
	abstract void showInfo();
	
	public void fillColor(String s)
	{
		System.out.println("Fill the color "+s);
	}
	abstract void describeShape();
}
 class GeometricalShape extends Shape
{
	void describeShape()
	{
		System.out.println("Geometrical Shape ");
	}

	@Override
	void showInfo()
	{
		System.out.println("..............");
	}
}
public class AbstractionExample 
{
	public static void main(String[] args) 
	{
		Shape shape = new GeometricalShape();
		shape.describeShape();
		shape.fillColor("PINK");
	}
}

