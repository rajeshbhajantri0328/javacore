package com.table;

public class Student {
	static int age=20;
	static void study() {
		System.out.println("student is studying");
	}
public static void main(String[] args) {
	System.out.println(Student.age);
	Student.study();
}
}
