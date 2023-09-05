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

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
    CustomerService s;
    @PostMapping("addnew")
    public Customer add(@RequestBody Customer ss)
    {
   	 return s.saveinfo(ss);
    }
    @PostMapping("addstudent")
    public List<Customer> adddetails(@RequestBody List<Customer> ss)
    {
   	 return s.savedetails(ss);
    }
    @GetMapping("showdetails")
    public List<Customer> show()
    {
   	 return s.showinfo();
    }
    @GetMapping("paging/{pageno}/{psize}")
	public List<Customer> showpagesortinfo(@PathVariable int pageno,@PathVariable int psize)
	{
		return s.getPage(pageno,psize);
	}
    @GetMapping("getbyid/{id}")
    public Optional<Customer> get(@PathVariable int id)
    {
    	return s.get(id);
    }
    @PutMapping("update") 
    public Customer modify(@RequestBody Customer ss) 
    { 
   	 return s.changeinfo(ss); 
    }
    @PutMapping("update1")
    public List<Customer> changes(@RequestBody List<Customer> ss)
    {
   	 return s.savedetails(ss);
    }
    @PutMapping("update2/{id}/{id1}")
    public void update2(@PathVariable int id,@PathVariable int id1)
    {
   	 s.update(id,id1);
    }
    @DeleteMapping("delete") 
    public String del(@RequestBody Customer ss) 
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

	
