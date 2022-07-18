package com.interfaceExamples;

public interface MusicalInstrument
{
	void play();
	public static void learnInstrument()
	{
		System.out.println("Learn Instrument here");
	}
}

abstract class Sound 
{
	abstract void listenSound();
}