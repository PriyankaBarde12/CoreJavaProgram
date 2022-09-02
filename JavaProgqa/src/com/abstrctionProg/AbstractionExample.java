package com.abstrctionProg;
abstract class Shape
{
	abstract void showInfo();
	
	public void fillColor(String s)
	{
		System.out.println("Fill the color "+s);
	}
	abstract void describeShape();
	Shape(int a,int b){} //constructor
}
 class GeometricalShape extends Shape
{
	GeometricalShape(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

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
		Shape shape = new GeometricalShape(5,8);
		shape.describeShape();
		shape.fillColor("PINK");
	}
}

