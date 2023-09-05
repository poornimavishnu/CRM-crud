package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomRepo;


@Service
public class CustomerService {
	@Autowired
    CustomRepo sr;
	public Customer saveinfo(Customer ss) {
 	   return sr.save(ss);
  }
  public List<Customer> showinfo()
  {
 	 return sr.findAll();
  }
  public List<Customer> savedetails(List<Customer> ss)
  {
 	 return (List<Customer>)sr.saveAll(ss);
  }
  //get
  public Optional<Customer> get(int id) {
		
		return sr.findById(id);
	}
   
	public Customer changeinfo(Customer ss) {
		
		return sr.saveAndFlush(ss);
	}
   public List<Customer> change(List<Customer> ss) {
		
		return (List<Customer>)sr.saveAll(ss);
	}
   public List<Customer> getPage(int pageno,int psize)
	{
		Page<Customer> p =sr.findAll(PageRequest.of(pageno,psize));
		return p.getContent();
	}
 
	public void deleteinfo(Customer ss) {
		
		sr.delete(ss);
	}
	public Optional<Customer> detail(int id)
	{
		return sr.findById(id);
	}
	public void deleteid(int id) {
		
		sr.deleteById(id);
	}
    
   public void delp(int id) {
		
		sr.deleteById(id);
	}
      public void update(int id,int id1) {
	// TODO Auto-generated method stub
    	  sr.update2(id,id1);
          }
   
}
