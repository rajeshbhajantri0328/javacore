package com.table;

public class Student1 {
	Student1(int a)
	{
		age =a;
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(20);
		Student1 s2=new Student1(25);
		
		System.out.println("Age: "+s1.age);
		System.out.println("Age: "+s2.age);
	}

}
