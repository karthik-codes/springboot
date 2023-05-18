package com.Security.authorization.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Security.authorization.Entity.Product;
@Service
public class ProductService {

	public ResponseEntity<List<Product>> getAllProduct() {
		List<Product>items=new ArrayList<>();
		Product p1=new Product("cycle",1,4000);
		Product p2=new Product("pulsar",2,140000);
		Product p3=new Product("k10",3,244000);
		items.add(p3);
		items.add(p2);
		items.add(p1);
		return ResponseEntity.status(HttpStatus.CREATED).body(items);
		
	}
}
