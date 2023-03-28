package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.InvoiceType;

@Repository
public interface InvoiceTypeRepository extends JpaRepository<InvoiceType, Long>{

}
