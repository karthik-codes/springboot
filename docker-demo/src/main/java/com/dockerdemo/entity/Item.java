package com.dockerdemo.entity;

public class Item {

	int serialNo;
	String name;
	int price;
	
	public Item() {}

	public Item(int serialNo, String name, int price) {
		super();
		this.serialNo = serialNo;
		this.name = name;
		this.price = price;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [serialNo=" + serialNo + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
