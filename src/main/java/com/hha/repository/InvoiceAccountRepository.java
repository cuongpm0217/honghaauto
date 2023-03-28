package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.InvoiceAccount;

@Repository
public interface InvoiceAccountRepository extends JpaRepository<InvoiceAccount, Long>{

}
