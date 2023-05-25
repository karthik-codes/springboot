package com.logRequest.ActuatorHealthCheck.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShoppingCart {

	int id;
	List<String> items;
	int price;
	
	public ShoppingCart() {}

	public ShoppingCart(int id, List<String> items, int price) {
		super();
		this.id = id;
		this.items = items;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", items=" + items + ", price=" + price + "]";
	}
	
	
	
}
