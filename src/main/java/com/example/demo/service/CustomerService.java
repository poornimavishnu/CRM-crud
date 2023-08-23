package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.CustomRepo;


@Service
public class CustomerService {
	@Autowired
    CustomRepo sr;
	public Model saveinfo(Model ss) {
 	   return sr.save(ss);
  }
  public List<Model> showinfo()
  {
 	 return sr.findAll();
  }
  public List<Model> savedetails(List<Model> ss)
  {
 	 return (List<Model>)sr.saveAll(ss);
  }
  //get
  public Optional<Model> get(int id) {
		
		return sr.findById(id);
	}
   
	public Model changeinfo(Model ss) {
		
		return sr.saveAndFlush(ss);
	}
   public List<Model> change(List<Model> ss) {
		
		return (List<Model>)sr.saveAll(ss);
	}
	public void deleteinfo(Model ss) {
		
		sr.delete(ss);
	}
	public Optional<Model> detail(int id)
	{
		return sr.findById(id);
	}
	public void deleteid(int id) {
		
		sr.deleteById(id);
	}
   public void delp(int id) {
		
		sr.deleteById(id);
	}
   
}
