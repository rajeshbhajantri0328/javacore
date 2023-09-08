package com.programing;

public class Pen {

	public static void main(String[] args) {
		// 2 1 4 3 6 5 7....n
		int n=10;
		for(int i=1; i<=n;i++) {
			System.out.print((i%2==0)?i-1+" ":i+1+" ");
		}

	}

}
