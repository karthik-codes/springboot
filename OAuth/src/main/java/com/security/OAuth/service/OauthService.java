package com.security.OAuth.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.security.OAuth.Entity.Item;

@Service
public class OauthService {

	
	public ResponseEntity<List<Item>> getAllProduct() {
		List<Item>items=new ArrayList<>();
		Item p1=new Item("pen",1,4000);
		Item p2=new Item("pencil",2,140000);
		Item p3=new Item("book",3,244000);
		items.add(p3);
		items.add(p2);
		items.add(p1);
		return ResponseEntity.status(HttpStatus.CREATED).body(items);
		
	}
	
	public ResponseEntity<Map<String,String>> getAvailableItems(){
		Map<String,String> itemMap=new HashMap<>();
		itemMap.put("pen", "available");
		itemMap.put("book", "not available");
		itemMap.put("papers", "available");
		return ResponseEntity.status(HttpStatus.OK).body(itemMap);
	}
}
