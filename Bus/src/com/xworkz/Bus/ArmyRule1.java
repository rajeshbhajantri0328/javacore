package com.xworkz.Bus;

public interface ArmyRule1 {
	final int MorningWakeup =5;
	int totalMembers=80;
	
	public abstract void discipline();
	public static void earlyMorning() {
		System.out.println("invoking earlymorning at "+MorningWakeup);
	}

}
