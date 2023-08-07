package com.xworkz.Bus;

public interface CompanyRules {
	static int people=200;
	long salary=10000;
	public static void discipline() {
		System.out.println("company maintains discipline among for about:"+people);
		
		
	}
	static void providesSalary() {
		System.out.println("company used to provide salary"+salary);
		
	}

}
