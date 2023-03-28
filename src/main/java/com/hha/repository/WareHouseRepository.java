package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.WareHouse;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouse, Long>{

}
