package com.abstrctionProg;

public class JuicierMachinceDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j =new Juicer();
		j.rotate();
		j.crush();
		j.filter();
		System.out.println("_________Reference of Juicer ______________");
		Machine m =new Juicer();
		m.rotate();
		m.crush();
		//Mixer mix =new Mixer();
		
	
	}

}
