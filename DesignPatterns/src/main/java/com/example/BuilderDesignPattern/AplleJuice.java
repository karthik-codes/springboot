package com.example.BuilderDesignPattern;

public class AplleJuice implements JuiceMaker {

	public Juice makeJuice(Juice juice) {
		juice.setJuicename("appleJuice");
		juice.setFruit(10);
		juice.setSugar(3);
		juice.setWater(4);
		System.out.println("juice will be ready in sometime");
		return juice;
	}

	public String setJuiceType(Juice juice) {
		juice.setJuceType("Apple");
		return juice.getJuceType();
	}

}
