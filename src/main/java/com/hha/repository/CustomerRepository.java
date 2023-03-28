package com.hha.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hha.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	@Query(value="Select * from customer where name like '%?' or tel1 like '%?' or tel2 like '%?' or gen_id like '%?'",nativeQuery=true)
	public List<Customer> findByTxt(String txtSearch);
}
