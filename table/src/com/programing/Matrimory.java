package com.programing;

public class Matrimory {

	public static void main(String[] args) {
		String gender = "f";
		int age = 19;
		if(gender=="") {
			System.out.println("good boy");
			if(age>=21) {
				System.out.println("married");
			}
			else {
				System.out.println("unmarried"); 
			}
		}
		else if(gender=="f") {
			System.out.println("gender is female");
			if(age>=18) {
				System.out.println("married");
			}
			else {
				System.out.println("unmarried"); 
			}
		}
		else {
			System.out.println("function invalid");
		}


	}

}
