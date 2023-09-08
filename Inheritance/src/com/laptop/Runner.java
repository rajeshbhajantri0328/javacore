package com.laptop;

public class Runner {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.brand+" "+c.cost);
		c.Start();
		
		System.out.println("-------");
		
		Bike b=new Bike();
	System.out.println(b.brand+" "+b.fuel);
	b.Stop();

	}

}
