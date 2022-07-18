package com.interfaceExamples;
//Strawberry, BlackForest
class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println("Strawberry cake goes here");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println("BlackForest goes here");
	}
}
public class CakeFlavour {

	public static void main(String[] args) 
	{
		Cake cake = new BlackForest();;
		cake.bake();
		cake = new Strawberry();
		cake.bake();
	}

}
