package com.abstrctionProg;
/*WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
which has only definition and one method wash() which also has 
implementation. Create class Child which extends Parent and add the missing 
method implementation. In main, use both the methods by creating instance 
of the concrete class.
Show use of parameterized constructor of parent class (Child class invokes 
parent’s parameterized constructor) using supe
*/
abstract class Parent
{
	Parent(String name)
	{
		System.out.println("Parent names is "+name);
	}
	abstract void cook();
	public void wash()
	{
		System.out.println("wash the veg");
	}
}
class Child extends Parent 
{
	Child(String name) 
	{
		super(name);
	}

	void cook()
	{
		System.out.println("child cook food");
	}
}
public class ParentAbst {

	public static void main(String[] args) {
		Parent p =new Child("ABC");
		p.cook();
		p.wash();
	}

}
