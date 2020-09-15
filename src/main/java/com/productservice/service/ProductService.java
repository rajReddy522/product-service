package com.productservice.service;

import java.util.List;

import com.productservice.entity.ProductCatalog;
import com.productservice.util.ProductException;

/**
 * Product Service
 *
 */
public interface ProductService {

	List<ProductCatalog> getProductList() throws ProductException;
	
	ProductCatalog getProductById(Long productId) throws ProductException;
	
	void addProduct(List<ProductCatalog> productList);
	
	void deleteProductById(Long productId) throws ProductException;
}
