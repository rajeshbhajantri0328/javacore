package com.constructor;

public class Vehicle {
	Vehicle(String brand,int cost){
		System.out.println("brand: "+brand+"cost: "+cost);
		
	}
	Vehicle(String brand){
		System.out.println("brand: "+brand);
		
	}
	Vehicle(String brand,String fuel){
		System.out.println("brand: " +brand+ "fuel: "+fuel);
		
	}
	Vehicle(int cost,String brand){
		System.out.println("brand: "+brand+"cost: "+cost);
		
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("bmw",2500);
		Vehicle v2=new Vehicle("audi");
		Vehicle v3=new Vehicle("bmw","petrol");
		Vehicle v4=new Vehicle(3000,"hero");
	}

}
