package com.springboot.ecomerceapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_customer")
public class ProductCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@ManyToOne
	private Product product; 
	
	@ManyToOne
	private Customer customer; 
	
	@Column(name = "purchase_date")
	private LocalDate purchaseDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	} 
	
	
	
}
