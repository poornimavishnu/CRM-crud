package com.example.demo.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

//import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {
	@Id
	//@Column(name="id")
	private int id;
	
	//@Column(name="first_name")
	private String firstName;
	
	//@Column(name="last_name")
	private String lastName;
	
	//@Column(name="email")
	private String email;
	
	//@Column(name="company")
	private String company;
   
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="productid")
	private Opportunities cs;
	
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="brandid")
    private List<Products> s;*/
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String email, String company, Opportunities cs) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.company = company;
		this.cs = cs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Opportunities getCs() {
		return cs;
	}

	public void setCs(Opportunities cs) {
		this.cs = cs;
	}
	


	

	
	

	
}
