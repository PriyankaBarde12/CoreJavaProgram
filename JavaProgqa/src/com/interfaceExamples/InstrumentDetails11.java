package com.interfaceExamples;

class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
		System.out.println("Play the PercussionInstrument ");
	}
	public void listenSound()
	{
		System.out.println("listen sound of PercussionInstrument");
	}
}
class StringedInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
		System.out.println("Play the StringedInstrument ");
	}
	public void listenSound()
	{
		System.out.println("listen sound of StringedInstrument ");
	}
}

public class InstrumentDetails11 
{

	public static void main(String[] args)
	{
		PercussionInstrument Tabla = new PercussionInstrument();
		Tabla.play();
		Tabla.listenSound();
		MusicalInstrument.learnInstrument();
		StringedInstrument Violin =new StringedInstrument();
		Violin.play();
		Violin.listenSound();
		MusicalInstrument.learnInstrument();
		
	}

}
