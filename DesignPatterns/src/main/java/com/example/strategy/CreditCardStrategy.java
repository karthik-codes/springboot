package com.example.strategy;

public class CreditCardStrategy implements PaymentStrategy  {

String cardHolderName;
int cardNo;
int cvv;

public CreditCardStrategy(String cardHolderName, int cardNo, int cvv) {
	super();
	this.cardHolderName = cardHolderName;
	this.cardNo = cardNo;
	this.cvv = cvv;
}

public void pay(int amount) {
		
	System.out.println(amount +" paid with credit/debit card");
	}

}
