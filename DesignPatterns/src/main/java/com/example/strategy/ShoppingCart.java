package com.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 List<Item> items;
 
 
 public ShoppingCart(List<Item> items) {
	super();
	this.items = items;
}

public List<Item> getItems() {
	return items;
}

public void setItems(List<Item> items) {
	this.items = items;
}

public void addItem(Item item) {
	items.add(item);
 }
 
 public void removeItem(Item item) {
	items.remove(item);
 }
 
 public int calculateTotal() {
	 int sum=0;
	 for(Item i:items) {
		 sum+=i.getCost();
	 }
	 
	 System.out.println("cost is"+sum);
	 return sum;
 }
 
 public void pay(PaymentStrategy ps) {
	 int amount=calculateTotal();
	 ps.pay(amount);
 }
 
 public static void main(String[] args) {
	 
	 
	 Item item1=new Item(2,2300);
	 Item item2=new Item(3,3300);
	 Item item3=new Item(4,4300);
	 List<Item> it=new ArrayList<Item>();
	 it.add(item3);
	 it.add(item1);
	 it.add(item2);
	 ShoppingCart sh=new ShoppingCart(it);
  
	
	sh.pay(new UpiStrategy("karthik","abcd"));
	sh.pay(new CreditCardStrategy("karthik",1234567,998));
 }
}
