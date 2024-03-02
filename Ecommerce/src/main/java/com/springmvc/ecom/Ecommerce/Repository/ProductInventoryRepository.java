package com.springmvc.ecom.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.ecom.Ecommerce.entity.ProductInventory;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Integer> {
	public ProductInventory findById(int id);
}
