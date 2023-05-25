package com.example.bridgePattern;

public class Traingle extends Shape{

	public Traingle(Color c) {
		super(c);
		
		
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		c.applyColor();
	}

}
