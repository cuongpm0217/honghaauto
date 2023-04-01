package com.hha.repository;

import com.hha.entities.InvoiceAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceAccountRepository extends JpaRepository<InvoiceAccount, Long>{

}
