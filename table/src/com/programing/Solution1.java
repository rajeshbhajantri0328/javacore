package com.programing;

import java.util.Scanner;

public class Solution1 {
	void add(int a,int b) {
		System.out.println("sum of " +a+ " and " +b+ " is "+(a+b));
	}
	public static void main(String[] args) {
		Solution1 s=new Solution1();
		Scanner scan=new Scanner(System.in);
		
		for(int i=1; i<=4; i++) {
			System.out.println("enter first number:");
			int a=scan.nextInt();
			System.out.println("enter second number:");
			int b=scan. nextInt();
			
			s.add(a, b);
			System.out.println("-------------");
		}
	}

}
