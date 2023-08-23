package com.example.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.CustomerService;

@RestController
public class Control {
	@Autowired
    CustomerService s;
    @PostMapping("addnew")
    public Model add(@RequestBody Model ss)
    {
   	 return s.saveinfo(ss);
    }
    @PostMapping("addstudent")
    public List<Model> adddetails(@RequestBody List<Model> ss)
    {
   	 return s.savedetails(ss);
    }
    @GetMapping("showdetails")
    public List<Model> show()
    {
   	 return s.showinfo();
    }
    @GetMapping("getbyid/{id}")
    public Optional<Model> get(@PathVariable int id)
    {
    	return s.get(id);
    }
    @PutMapping("update") 
    public Model modify(@RequestBody Model ss) 
    { 
   	 return s.changeinfo(ss); 
    } @PutMapping("update1")
    public List<Model> changes(@RequestBody List<Model> ss)
    {
   	 return s.savedetails(ss);
    }
    @DeleteMapping("delete") 
    public String del(@RequestBody Model ss) 
    { 
   	 s.deleteinfo(ss); 
        return "Deleted Successfully"; 
     }
    @DeleteMapping("detail")
    public void delp(@RequestParam int id)
    {
    }
    @DeleteMapping("details/{id}")
    public void del(@PathVariable int id)
    {
   	 s.deleteid(id);
    } 
}

	
