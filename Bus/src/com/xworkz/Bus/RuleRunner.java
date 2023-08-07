package com.xworkz.Bus;

public class RuleRunner {
	
	public static void main(String[] args) {
		ArmyRule1 obj1=new ArmyRule2();
		SaloonRules obj2=new ArmyRule2();
		HospitalRules obj3=new ArmyRule2();
		obj1.discipline();
		ArmyRule1.earlyMorning();
		System.out.println("\n");
		SaloonRules.glowUp();
		SaloonRules.priceForEachHairCut();
		System.out.println("\n");
		HostelRules.room();
		HostelRules.strength();
		System.out.println("\n");
		HospitalRules.operation();
		obj3.treatment();
		System.out.println("\n");
		MetroRules.speed();
		MetroRules.travelling();
		System.out.println("\n");
		HotelRules.providingFood();
		HotelRules.spendTime();
		System.out.println("\n");
		TempleRules.praying();
		TempleRules.providingFood();
		System.out.println("\n");
		Airport.speed();
		Airport.travelling();
		System.out.println("\n");
		Theater.resting();
		Theater.watchingMovie();
		System.out.println("\n");
		HomeRules.followRules();
		HomeRules.resting();
		System.out.println("\n");
		HusbandRules.cooking();
		HusbandRules.helping();
		System.out.println("\n");
		WifeRules.cooking();
		WifeRules.helping();
		System.out.println("\n");
		PubRules.dancing();
		PubRules.drinking();
		System.out.println("\n");
		Patent.innovation();
		Patent.resarch();
		System.out.println("\n");
		VtuRules.examAttendence();
		VtuRules.providesSyllabus();
		System.out.println("\n");
		Bank.givingLoans();
		Bank.storingMoney();
		
		
		
		
		
		
	}

}
