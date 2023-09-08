package com.programing;

import java.util.Scanner;

public class Employee1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Age:");
		int age=s.nextInt();
		
		System.out.println("enter Name:");
		String name=s.next();
		
		System.out.println("enter Salary:");
		double salary=s.nextDouble();
		
		System.out.println("----------");
		System.out.println("Age:"+age+"\nName:"+name+"\nSalary:"+salary);
	}

}
