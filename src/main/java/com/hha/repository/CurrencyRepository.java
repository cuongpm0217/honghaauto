package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long>{

}
