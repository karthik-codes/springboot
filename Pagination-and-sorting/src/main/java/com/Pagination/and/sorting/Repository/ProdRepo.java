package com.Pagination.and.sorting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pagination.and.sorting.Entity.Product;

@Repository
public interface ProdRepo extends JpaRepository<Product, Integer>{

	
	
}
