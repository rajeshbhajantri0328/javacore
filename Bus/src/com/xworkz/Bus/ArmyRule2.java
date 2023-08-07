package com.xworkz.Bus;

public class ArmyRule2 implements ArmyRule1,SaloonRules,HospitalRules{
	@Override
	public void discipline() {
		System.out.println("invoking discipline for "+totalMembers);
	}
	@Override
	public void treatment() {
		System.out.println("invoking override treatment for army class");
		
	}

}
