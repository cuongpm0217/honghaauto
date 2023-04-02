package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long>{

}
