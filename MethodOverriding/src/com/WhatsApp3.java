package com;

public class WhatsApp3 extends WhatsApp2 {

	@Override
	void display() {
		super.display();
		System.out.println("Blue ticks supported");
		
	}
	@Override
	void call() {
		super.call();
		System.out.println("Video call supported");
	}
	void story() {
		System.out.println("an upload images as story");
	}
	

}
