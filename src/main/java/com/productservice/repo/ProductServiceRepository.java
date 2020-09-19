package com.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productservice.entity.Product;

/**
 * Repository class
 *
 */
@Repository
public interface ProductServiceRepository extends JpaRepository<Product, Long> {

}
