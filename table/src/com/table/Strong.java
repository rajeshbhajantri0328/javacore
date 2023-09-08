package com.table;

public class Strong {
	int age;
	Strong(int a)
	{
		age=a;
	}
	public static void main(String[] args) {
		Strong s1=new Strong(20);
		Strong s2=new Strong(25);
		
		System.out.println("age:"+s1.age);
		System.out.println("age:"+s2.age);
	}

}
