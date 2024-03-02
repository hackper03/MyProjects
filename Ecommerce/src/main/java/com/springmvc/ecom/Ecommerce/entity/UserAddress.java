package com.springmvc.ecom.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_address")
public class UserAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name="user_id")
	private Users users;
	private String address;
	private String city;
	private int zip;
	private String country;
	private Long mobile;
	public UserAddress() {
		super();
	}
	public UserAddress(int id, Users users, String address, String city, int zip, String country, Long mobile) {
		super();
		this.id = id;
		this.users = users;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.country = country;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserAddress [users=" + users + ", id=" + id + ", address=" + address + ", city=" + city + ", zip=" + zip
				+ ", country=" + country + ", mobile=" + mobile + "]";
	}
		
} 
