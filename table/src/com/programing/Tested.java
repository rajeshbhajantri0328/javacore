package com.programing;

public class Tested {
	int display() {
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("start");
		Tested t=new Tested();
		t.display();
		System.out.println(t.display());
	}

}
