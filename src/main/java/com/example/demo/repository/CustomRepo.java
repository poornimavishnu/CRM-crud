package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;

public interface CustomRepo extends JpaRepository<Customer, Integer>{
	@Query(value="select * from Customer where id=:o",nativeQuery=true)
	public List<Customer> getOwner(@Param("o") int id);
	@Modifying
	@Transactional
	@Query(value="delete from Customer where id:=0",nativeQuery=true)
	public int deleteinfo(@Param("s") int id);
}
