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
	@Query(value="update Customer set id=?1 where id=?2",nativeQuery = true)
	public int update2(int newid, int oldid);
	@Modifying
	@Transactional
	@Query(value="delete from Customer where id:=o",nativeQuery=true)
	public int deleteinfo(@Param("o") int oldid);
}
