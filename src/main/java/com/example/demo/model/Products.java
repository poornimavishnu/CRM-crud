package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Brand")
public class Products {
     @Id
     private int brand_id;
     private String brand_name;
     private String Avail;
     
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int brand_id, String brand_name, String status) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.Avail = status;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getStatus() {
		return Avail;
	}

	public void setStatus(String status) {
		this.Avail = status;
	}

	

	
	
     
}
