package com.example.strategy;

public class UpiStrategy implements PaymentStrategy{
	String upiName;
	String password;
	public UpiStrategy(String upiName, String password) {
		super();
		this.upiName = upiName;
		this.password = password;
	}
	public void pay(int amount) {
		System.out.println(amount + " paid using phonepay.");
		
	}
	
	

}
