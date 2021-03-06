package com.productservice.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.entity.Product;
import com.productservice.repo.ProductServiceRepository;
import com.productservice.service.ProductService;
import com.productservice.util.ProductException;

/**
 * Business Logic to CURD operations on Product 
 *
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductServiceRepository serviceRepository;

	/**
	 *
	 */
	@Override
	public List<Product> getProductList() throws ProductException {
		return serviceRepository.findAll();
	}

	/**
	 *
	 */
	@Override
	public Product getProductById(Long productId) throws ProductException {

		Optional<Product> result = serviceRepository.findById(productId);
		if (result.isPresent())
			return result.get();
		else
			throw new ProductException("Given ProductId = " + productId + " is not found");

	}

	@Override
	public void addProduct(List<Product> productList)  {
		serviceRepository.saveAll(productList);
	}

	@Override
	public void deleteProductById(Long productId) throws ProductException {		
		serviceRepository.deleteById(productId);


	}

}
