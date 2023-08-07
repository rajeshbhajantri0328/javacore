package com.xworkz.Bus;

public interface SaloonRules {
	int price=30;
	static String name="Saloon";
	static void glowUp() {
		System.out.println("invoking saloon in ArmyRule2 name:"+name);
		
	}
	public static void priceForEachHairCut() {
		System.out.println("invoking priceForEachHairCut saloon price:"+price);
		
	}

}
