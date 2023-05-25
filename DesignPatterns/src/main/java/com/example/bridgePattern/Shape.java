package com.example.bridgePattern;

public abstract class Shape {
protected Color c;

public Shape(Color c) {
	this.c=c;
	
}
abstract public void applyColor();
}
