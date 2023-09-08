package com.table;

public class Test {
	{
		System.out.println("in non-static block-1");
	}
	{
		System.out.println("in non-static block-2");
	}
	public static void main(String[] args) {
		System.out.println("start");
		Test t=new Test();
		System.out.println("end");
	}
	{
		System.out.println("in non-static block-3");
	}


}
