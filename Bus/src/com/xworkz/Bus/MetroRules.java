package com.xworkz.Bus;

public interface MetroRules {
	static int price=30;
	int tracks=2;
	public static void travelling() {
		System.out.println("metro is used for travelling with tracks:"+tracks);
		
	}
	static void speed() {
		System.out.println("metro uses is its speed with less price:"+price);
	}

}
