package com.hha.repository;

import com.hha.entities.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query(value="select * from Product p where p.group_id=:groupId",
			nativeQuery=true)	
	List<Product> getByGroupId(@Param("groupId") Long id);
	@Query(value="select * from Product p where p.type_id=:typeId",
			nativeQuery=true)
	List<Product> getByTypeId(@Param("typeId") Long id);
}
