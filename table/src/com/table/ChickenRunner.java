package com.table;

public class ChickenRunner {
	public static void main(String[] args) {

		Chicken chicken = new Chicken(230, "Belagavi");
		chicken.printInfo();
		
		Chicken chicken1 = new BroilerChicken(250, "Pune", true, 2.0f);
		chicken1.printInfo();
		
		Chicken chicken2 = new FarmChicken(300, "Kolapur",5, "Mulla");
		chicken2.printInfo();
	}

}
