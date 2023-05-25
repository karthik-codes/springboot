package com.example.bridgePattern;

public class RedColor implements Color {

	public void applyColor() {
		System.out.println("red.");
	}
	
	public static void main(String[] args) {
		Shape traingle=new Traingle(new RedColor());
		traingle.applyColor();
	}

}
