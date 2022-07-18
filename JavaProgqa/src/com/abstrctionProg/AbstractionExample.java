package com.abstrctionProg;
abstract class Shape
{
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
