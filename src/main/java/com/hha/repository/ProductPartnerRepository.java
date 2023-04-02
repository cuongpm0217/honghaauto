package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.ProductPartner;

@Repository
public interface ProductPartnerRepository extends JpaRepository<ProductPartner, Long>{

}
