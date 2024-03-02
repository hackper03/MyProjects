package com.springmvc.ecom.Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.ecom.Ecommerce.DAO.ProductDAO;
import com.springmvc.ecom.Ecommerce.Repository.ProductRepository;
import com.springmvc.ecom.Ecommerce.entity.Product;

@Service
public class ProductService implements ProductDAO{
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product getProduct(int id) {
		System.out.println(productRepository.findById(id).orElse(null));
		return productRepository.findById(id).orElse(null);
	}
}
