package com.springmvc.ecom.Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.ecom.Ecommerce.DAO.ProductInventoryDAO;
import com.springmvc.ecom.Ecommerce.Repository.ProductInventoryRepository;
import com.springmvc.ecom.Ecommerce.entity.ProductInventory;

@Service
public class ProductInventoryService implements ProductInventoryDAO{
	@Autowired
	ProductInventoryRepository inventoryRepository;
	
	public ProductInventory getAInventory(int id) {
		// TODO Auto-generated method stub
		ProductInventory aProduct = inventoryRepository.findById(id);
		if(aProduct != null) {
			return aProduct;
		}
		return null;
	}
	
}
