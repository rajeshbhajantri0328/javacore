package com.xworkz.Bus;

public interface TempleRules {
	static int priceForEntry=30;
	int openingTime=12;
	public static void providingFood() {
		System.out.println("temple is used for providing with price:"+priceForEntry);
		
	}
	static void praying() {
		System.out.println("temple is used to spend times generally used for praying within time:"+openingTime);
	}

}
