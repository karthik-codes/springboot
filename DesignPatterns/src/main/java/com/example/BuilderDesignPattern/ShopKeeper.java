package com.example.BuilderDesignPattern;

public class ShopKeeper {
	
	public static Juice prepareJuice(String juiceName) {
		JuiceMaker jm=null;
		if(juiceName.equalsIgnoreCase("Apple")) {
			jm=new AplleJuice();
			jm.makeJuice(jm.juice);
			
		}
		else if(juiceName.equalsIgnoreCase("Orange")) {
			jm=new OrangeJuice();
		}
		return jm.makeJuice(jm.juice);
	}

	public static void main(String[] args) {
		
ShopKeeper sk=new ShopKeeper();
//sk.prepareJuice("Oarnge");
		
		Juice orange=sk.prepareJuice("Apple");
	}

}
