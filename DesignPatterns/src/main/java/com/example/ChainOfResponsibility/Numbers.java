package com.example.ChainOfResponsibility;

public class Numbers {
	
	private int no1;
	private int n02;
	private String calcWanted;
	public Numbers(int no1, int n02, String calcWanted) {
		super();
		this.no1 = no1;
		this.n02 = n02;
		this.calcWanted = calcWanted;
	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getN02() {
		return n02;
	}
	public void setN02(int n02) {
		this.n02 = n02;
	}
	public String getCalcWanted() {
		return calcWanted;
	}
	public void setCalcWanted(String calcWanted) {
		this.calcWanted = calcWanted;
	}
	
	

}
