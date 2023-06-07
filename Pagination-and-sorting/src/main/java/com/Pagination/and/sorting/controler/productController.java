package com.Pagination.and.sorting.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pagination.and.sorting.Entity.Product;
import com.Pagination.and.sorting.service.ProductService;

@RestController
@RequestMapping("/products")
public class productController {

	@Autowired
	ProductService service;
	
	@GetMapping()
	public List<Product> getAllRecords() {
		return service.getAllProduct();
	}
	
	@GetMapping("/{getField}")
	public List<Product> respnseWithSorting(@PathVariable String getField) {
		System.out.println(service.findAllProductWithSorting(getField).size());
		return service.findAllProductWithSorting(getField);
	}
	
	@GetMapping("/{offset}/{limit}")
	public Page<Product> getPagingination(@PathVariable int offset,@PathVariable int limit) {
		return service.findProductsWithPagination(offset, limit);
	}
	
	@GetMapping("/{offset}/{limit}/{field}")
	public Page<Product> getPaginationWithSorting(@PathVariable int offset,@PathVariable int limit,@PathVariable String field) {
		return service.findProductsWithPaginationAndSorting(offset, limit, field);
	}
}
