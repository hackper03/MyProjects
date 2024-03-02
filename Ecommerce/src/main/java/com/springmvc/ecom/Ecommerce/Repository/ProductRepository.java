package com.springmvc.ecom.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.ecom.Ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
