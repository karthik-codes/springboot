package com.Security.authorization.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Security.authorization.Entity.Product;
import com.Security.authorization.Service.ProductService;

@RestController
@RequestMapping("/auth")
public class productController {
@Autowired
ProductService pService;

@GetMapping("/fetch")
public String sayHello() {
	return "without authorization";
}
	
	@PostMapping("/authorize")
	public ResponseEntity<List<Product>> createResource(){
		return pService.getAllProduct();
	}
	

}
