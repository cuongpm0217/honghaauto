package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long>{

}
