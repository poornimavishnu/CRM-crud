package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="opp")
public class Opportunities {
    @Id
   
    private int purchase_id;
    private String productname;
    private String  status;
    
	public Opportunities() {
		super();
	}

	public Opportunities(int purchase_id, String productname, String status) {
		super();
		this.purchase_id = purchase_id;
		this.productname = productname;
		this.status = status;
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
    
}
