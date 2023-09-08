package com.programing;

public class LoginValidation {
	public static void main(String[] args) {
		String id ="admin";
		int password =123;
		if(id=="admin") {
			System.out.println("user id is valid");
			if(password==123)
			{
				System.out.println("password is valid");
				System.out.println("login successful :) ");
			}
			else {
				System.out.println("password is invalid");
				System.out.println("login unsuccessful :(");
			}
		}
		else {
			System.out.println("user id is invalid");
			System.out.println("login unsuccessful :(");
		}
	}

}
