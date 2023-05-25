package com.example.BuilderDesignPattern;

public class OrangeJuice implements JuiceMaker {

	public Juice makeJuice(Juice juice) {
		juice.setJuicename("orangejuice");
		juice.setFruit(5);
		juice.setSugar(2);
		juice.setWater(2);
		return juice;
		
	}
	
	public String setJuiceType(Juice juice) {
		juice.setJuceType("Orange");
		return juice.getJuceType();
	}

}
