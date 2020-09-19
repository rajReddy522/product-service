package com.productservice.service;


import java.util.List;

import com.productservice.entity.Product;
import com.productservice.util.ProductException;

/**
 * Product Service
 *
 */
public interface ProductService {

	List<Product> getProductList() throws ProductException;
	
	Product getProductById(Long productId) throws ProductException;
	
	void addProduct(List<Product> productList);
	
	void deleteProductById(Long productId) throws ProductException;
}
