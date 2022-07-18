package com.functionslInterfce;

public class Learnlamda {

	public static void main(String[] args) {
		Service s =(String name)->{
			System.out.println("service............"+name);
		};
		s.provideService("Curier");   
	}

}
