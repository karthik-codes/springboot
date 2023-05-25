package com.example.ChainOfResponsibility;

public class AddNumbers implements Chain {
	
	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}

	public void claculate(Numbers req) {
		if(req.getCalcWanted()=="add") {
			System.out.println(req.getNo1()+ "+" +req.getN02()+"total is: "+req.getN02()+req.getNo1());
		}
		else {
			nextInChain.claculate(req);
		}
		
	}

}
