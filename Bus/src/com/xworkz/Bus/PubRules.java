package com.xworkz.Bus;

public interface PubRules {
	static int people=30;
	int price=4000;
	public static void dancing() {
		System.out.println("pub is used for enjoying and dancing with people for about:"+people);
		
	}
	static void drinking() {
		System.out.println("pub provides variety of drink:"+price);
	}

}
