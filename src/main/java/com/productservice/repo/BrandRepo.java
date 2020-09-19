package com.productservice.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productservice.entity.Brand;



@Repository
public interface BrandRepo 
        extends JpaRepository<Brand, Long> {
 
}
