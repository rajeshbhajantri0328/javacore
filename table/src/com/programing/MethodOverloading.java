package com.programing;

public class MethodOverloading {
	void display() {
		System.out.println("hello raj");
	}
	void display(int x) {
		System.out.println(x);
	}
	void display(double x) {
		System.out.println(x);
	}
	void display(int x,String y) {
		System.out.println(x+" "+y);
	}
	void display(String x, int y) {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.display();
		m.display(25);
		m.display(12,"raj");
		m.display(20.7);
		m.display("rahul",60);
		
	}

}
