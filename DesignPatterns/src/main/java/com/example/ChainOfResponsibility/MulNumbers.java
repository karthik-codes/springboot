package com.example.ChainOfResponsibility;

public class MulNumbers {

	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}

	public void claculate(Numbers req) {
		if(req.getCalcWanted()=="mul") {
			System.out.println(req.getNo1()+ "*" +req.getN02()+"total is: "+(req.getN02()*req.getNo1()));
		}
		else {
			nextInChain.claculate(req);
		}
		
	}
	
	public static void main(String[] args) {
		Chain addChain=new AddNumbers();
		Chain multiplyChain=new AddNumbers();
		
		addChain.setNextChain(multiplyChain);
		addChain.setNextChain(addChain);
		
		Numbers request=new Numbers(4,2,"mul");
		addChain.claculate(request);
	}
}
