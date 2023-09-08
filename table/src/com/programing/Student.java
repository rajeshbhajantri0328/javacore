package com.programing;

public class Student {
	String name;
	int marks;
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		
		System.out.println("*****************");
		
		s1.name="raj";
		s1.marks=35;
		
		s2.name="rahul";
		s2.marks=34;
		System.out.println(s1.name+"has scored "+s1.marks+" marks in java");
		System.out.println(s2.name+"has scored "+s2.marks+" marks in java");
		
		}

}
