package com.example.BuilderDesignPattern;

public interface JuiceMaker {
	public static final Juice juice = new Juice();
	public Juice makeJuice(Juice juice);
	
	public String setJuiceType(Juice juice);
		 


}
