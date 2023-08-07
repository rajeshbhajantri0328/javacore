package com.xworkz.Bus;

public interface Airport {
	static int price=3000;
	int peoplesInAeroplane=60;
	public static void travelling() {
		System.out.println("Airport is used for travelling with price:"+price);
		
	}
	static void speed() {
		System.out.println("using airport one can travel soon with rang of people about:"+peoplesInAeroplane);
		
	}

}
