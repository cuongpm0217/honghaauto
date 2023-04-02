package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.ProductColor;

@Repository
public interface ProductColorRepository extends JpaRepository<ProductColor, Long>{

}
