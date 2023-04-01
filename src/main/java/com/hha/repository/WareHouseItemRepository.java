package com.hha.repository;

import com.hha.entities.WareHouseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WareHouseItemRepository extends JpaRepository<WareHouseItem, Long>{

}
