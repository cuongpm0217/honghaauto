package com.hha.repository;

import com.hha.entities.ProductPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPartnerRepository extends JpaRepository<ProductPartner, Long> {

}
