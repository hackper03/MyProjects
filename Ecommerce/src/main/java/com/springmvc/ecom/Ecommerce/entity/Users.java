package com.springmvc.ecom.Ecommerce.entity;

import java.util.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String email_id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String first_name;
	@Column(nullable = false)
	private String last_name;
	@Column(nullable = false)
	private Long mobile;
	@Temporal(TemporalType.DATE)
	private Date date;
	@OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
	private UserAddress userAddress;
	
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	public Users() {
		super();
	}
	
	public Users(int id, String email_id, String username, String first_name, String last_name, Long mobile, Date date,
			UserAddress userAddress) {
		super();
		this.id = id;
		this.email_id = email_id;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
		this.date = date;
		this.userAddress = userAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", email_id=" + email_id + ", username=" + username + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", mobile=" + mobile + ", date=" + date + ", userAddress=" + userAddress
				+ "]";
	}	
}
