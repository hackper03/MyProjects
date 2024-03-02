package com.springmvc.ecom.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.ecom.Ecommerce.Service.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;  
	
	@GetMapping("/{id}")
	public void productPage(@PathVariable int id) {
		productService.getProduct(id);
	}
	
	@GetMapping
	public String getProductPage() {
		return "product";
	}
}
