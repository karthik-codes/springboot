package com.Pagination.and.sorting.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Pagination.and.sorting.Entity.Product;
import com.Pagination.and.sorting.Repository.ProdRepo;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {

	//one offset value =10 i.e if we want to see 1 - 10 records offset=1,limit =10
	//if we want to see 10-20 records means offset=2 and limit =20
	
	@Autowired
	ProdRepo pRepo;
	
	@PostConstruct
	public void initDB() {
		List<Product> listOfProduct=IntStream.rangeClosed(1, 100).mapToObj(i->new Product(new Random().nextInt(100),
				"product" +i,new Random().nextInt(500),new Random().nextInt(5000))).collect(Collectors.toList());
		
		pRepo.saveAll(listOfProduct);
	}
	
	public List<Product> getAllProduct(){
		return pRepo.findAll();
	}
	
	public List<Product> findAllProductWithSorting(String field){
		return pRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public Page<Product> findProductsWithPagination(int offset,int pagesize){
		return pRepo.findAll(PageRequest.of(offset, pagesize));
	}
	
	public Page<Product> findProductsWithPaginationAndSorting(int offset,int pagesize,String field) {
		return pRepo.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
	}
}
