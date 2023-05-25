package com.example.ChainOfResponsibility;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void claculate(Numbers req);

}
