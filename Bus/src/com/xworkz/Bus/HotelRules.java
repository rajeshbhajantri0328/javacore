package com.xworkz.Bus;

public interface HotelRules {
	static int fullMealPrice=300;
	int branches=2;
	public static void providingFood() {
		System .out.println("hotel is used for providingFood with price:"+fullMealPrice);
		
	}
	static void spendTime() {
		System.out.println("hotel is used to spend time as it has many branches:"+branches);
		
	}

}
