package com.xworkz.Bus;

public interface HomeRules {
	static int people=4;
	int sizeOfSiteInSqFt=2000;
	public static void resting() {
		System.out.println("home is used for resting with sizeOfSiteInSqFt:"+sizeOfSiteInSqFt);
	}
	static void followRules() {
		System.out.println("home rules are made by father we must follow:"+people);
		
	}
	

}
