package com.laptop;

public class Run {

	public static void main(String[] args) {
		Department d=new Department();
		
		System.out.println("university name:"+d.UniversityName);
		System.out.println("college name:"+d.CollageName);
		System.out.println("department name:"+d.departmentName);
		
		System.out.println("--------------");
		
		d.conductExam();
		d.fest();
		d.providePlacements();

	}

}
