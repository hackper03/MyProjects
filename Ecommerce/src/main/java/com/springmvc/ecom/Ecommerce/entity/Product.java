package com.springmvc.ecom.Ecommerce.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="description",nullable = false,length = 100)
	private String description;
	private double price;
	@Temporal(TemporalType.DATE)
	private Date created_at;
	@OneToOne
	@JoinColumn(name = "product_inventory_id")
	@MapsId
	private ProductInventory productInventory;	
	
	public Product() {
		super();
	}
	public Product(int id, String name, String description, double price, Date created_at,
			ProductInventory productInventory) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.created_at = created_at;
		this.productInventory = productInventory;
	}
	public ProductInventory getProductInventory() {
		return productInventory;
	}
	public void setProductInventory(ProductInventory productInventory) {
		this.productInventory = productInventory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", created_at=" + created_at + ", productInventory=" + productInventory.getId() + "]";
	}
	
}
