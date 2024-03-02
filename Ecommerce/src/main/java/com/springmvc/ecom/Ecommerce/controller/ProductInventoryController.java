package com.springmvc.ecom.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.ecom.Ecommerce.Service.ProductInventoryService;
import com.springmvc.ecom.Ecommerce.entity.ProductInventory;

@RestController
@RequestMapping("/productinventory")
public class ProductInventoryController {
	@Autowired
	ProductInventoryService inventoryService;
	
	@GetMapping("")
	public void inventory() {
		ProductInventory aInventory = inventoryService.getAInventory(1);
		if(aInventory != null) {
			System.out.println(aInventory);
		}
		
	}
}
