package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.Color;

@Repository
public interface ColorRepository  extends JpaRepository<Color, Long>{

}
