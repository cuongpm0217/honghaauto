package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
}
