package com.logRequest.ActuatorHealthCheck.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	public static List<String> addItems(){
		List<String> ss=new ArrayList<>();
		ss.add("mobile");
		ss.add("laptop");
		ss.add("jeans");
		ss.add("charger");
		return ss;
		
	}
	public ResponseEntity<List<String>> getAllItems(){
		List<String>items=addItems();
		return ResponseEntity.status(200).body(items);
	}
}
