package com.productservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.entity.Product;
import com.productservice.service.ProductService;
import com.productservice.util.ProductException;

/**
 * Product Service Controller 
 *
 */
@RestController
public class ProductServiceController {

	@Autowired
	private ProductService productService;

	/**
	 * @return
	 * @throws Exception
	 */
	@GetMapping(path = "/products", produces = "application/json")
	public List<Product> getProducts() throws ProductException {
		return productService.getProductList();
	}

	/**
	 * @param productId
	 * @return
	 * @throws Exception
	 */
	@GetMapping(path = "/product/{productId}", produces = "application/json")
	public Product getProductById(@PathVariable Long productId) throws ProductException {
		return productService.getProductById(productId);
	}

	/**
	 * @param productList
	 * @throws Exception
	 */
	@PostMapping(path = "/addProduct", consumes = "application/json")
	public void addProduct( @RequestBody List<Product> productList) {
		productService.addProduct(productList);
	}

	/**
	 * @param productId
	 * @throws Exception
	 */
	@DeleteMapping(path = "/product/delete/{productId}")
	public void deleteProductById(@PathVariable Long productId) throws ProductException {
		 productService.deleteProductById(productId);
	}
}
