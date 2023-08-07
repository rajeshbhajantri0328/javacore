package com.xworkz.Bus;

public interface HospitalRules {
	static double bill=10000;
	final int totalRooms=40;
	
	public abstract void treatment();
	
	public static void operation() {
		System.out.println("invoking operation in hospital with price="+bill);
		
	}
	

}
