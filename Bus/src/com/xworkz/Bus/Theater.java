package com.xworkz.Bus;

public interface Theater {
	static int people=60;
	int price=100;
	public static void resting() {
		System.out.println("home is used for resting for about:"+people);
		
	}
	static void watchingMovie() {
		System.out.println("theater is used for watchingMovie with for each movie:"+price);
	}

}
